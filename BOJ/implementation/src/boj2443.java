import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = N; i > 0; i--) {
            for (int j = N; j > i; j--) {
                sb.append(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}