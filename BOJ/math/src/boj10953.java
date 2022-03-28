import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int sum;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), ",");

            sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}