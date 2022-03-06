import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1920 {
    static int[] nNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N, M, m;
        boolean flag;

        N = Integer.parseInt(br.readLine());
        nNum = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nNum[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nNum);

        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
            m = Integer.parseInt(st.nextToken());

            flag = binarySearch(m);

            if (flag) {
                sb.append(1).append("\n");
            }
            else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }

    static boolean binarySearch(int m) {
        boolean exist = false;
        int low = 0;
        int high = nNum.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (nNum[mid] < m) {
                low = mid + 1;
            }
            else if (nNum[mid] > m) {
                high = mid - 1;
            }
            else {
                exist = true;
                break;
            }
        }

        return exist;
    }
}