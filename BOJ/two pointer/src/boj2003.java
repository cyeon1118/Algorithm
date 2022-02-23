import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2003 {
    static int N, M;
    static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        num = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int j = 0; j < N; j++) {
            cnt += nSum(j);
        }

        System.out.println(cnt);
    }

    static int nSum(int n) {
        int sum = 0;

        while (n <= N - 1) {
            sum += num[n];

            if (sum < M) {
                n++;
            }
            else {
                break;
            }
        }

        if (sum == M) {
            return 1;
        }
        else {
            return 0;
        }
    }
}