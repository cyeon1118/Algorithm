import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean flag;

        for (int i = M; i <= N; i++) {
            flag = numCheck(i);

            if (i == 2) {
                sb.append(i).append("\n");
            }
            else if (i > 2) {
                if (i % 2 != 0) {
                    if (flag) {
                        sb.append(i).append("\n");
                    }
                }
            }
        }

        System.out.println(sb);
    }

    static boolean numCheck(int n) {
        for (int j = 2; j <= (int) Math.sqrt(n); j++) {
            if (n % j == 0) {
                return false;
            }
        }

        return true;
    }
}