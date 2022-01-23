import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj5355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < T ; i++) {
            st = new StringTokenizer(br.readLine());
            float N = Float.parseFloat(st.nextToken());

            while (st.hasMoreTokens()) {
                String operator = st.nextToken();
                switch (operator) {
                    case "@" :
                        N *= 3;
                        break;
                    case "%" :
                        N += 5;
                        break;
                    case "#" :
                        N -= 7;
                        break;
                }
            }
            sb.append(String.format("%.2f", N)).append("\n");
        }
        System.out.println(sb);
    }
}