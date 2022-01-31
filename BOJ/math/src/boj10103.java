import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int c, s;
        int cScore = 100;
        int sScore = 100;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            c = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());

            if (c < s) {
                cScore -= s;
            }
            else if (c > s) {
                sScore -= c;
            }
        }

        System.out.println(cScore);
        System.out.println(sScore);
    }
}