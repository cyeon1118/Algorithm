import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int A, B, num;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            num = 1;

            for (int j = 0; j < B; j++) {
                num = (num * A) % 10;
            }

            if (num == 0) {
                sb.append(10).append("\n");
            }
            else {
                sb.append(num).append("\n");
            }
        }

        System.out.println(sb);
    }
}