import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = 0;
        for (int i = 0; i < 4; i++) {
            S += Integer.parseInt(st.nextToken());
        }

        int T = 0;
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < 4; j++) {
            T += Integer.parseInt(st.nextToken());
        }

        System.out.println(Math.max(S, T));
    }
}