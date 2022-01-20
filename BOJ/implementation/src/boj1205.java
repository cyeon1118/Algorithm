import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int scoreNum = Integer.parseInt(st.nextToken());

        if (N == 0) {
            System.out.println("1");
        }
        else {
            int rank = 1;
            int cnt = 1;
            int tRank = 0;

            int[][] rankList = new int[N][2];
            st = new StringTokenizer(br.readLine());
            for (int i = 0 ; i < N ; i++) {
                rankList[i][0] = Integer.parseInt(st.nextToken());
            }

            rankList[0][1] = rank;
            for (int j = 0 ; j < N-1 ; j++) {
                if (rankList[j][0] == rankList[j+1][0]) {
                    rankList[j+1][1] = rankList[j][1];
                    cnt++;
                }
                else if (rankList[j][0] > rankList[j+1][0]) {
                    rank = rankList[j+1][1] = rank + cnt;
                    cnt = 1;
                }
            }

            for (int k = 0 ; k < N ; k++) {
                if (rankList[k][0] == T) {
                    tRank = rankList[k][1];
                    break;
                }
                else if (rankList[k][0] < T) {
                    tRank = rankList[k][1];
                    break;
                }
            }

            if (tRank == 0) {
                tRank = N + 1;
            }

            if (rankList.length == scoreNum) {
                if (rankList[scoreNum-1][0] == T) {
                    System.out.println(-1);
                }
                else if (tRank > scoreNum) {
                    System.out.println(-1);
                }
                else {
                    System.out.println(tRank);
                }
            }
            else {
                System.out.println(tRank);
            }
        }
    }
}
