import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj11256 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int J = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            Integer[] box = new Integer[N];

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                box[j] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
            }

            Arrays.sort(box, Collections.reverseOrder());

            int index = 0;
            while (J > 0) {
                if (J > box[index]) {
                    J -= box[index];
                    index++;
                }
                else {
                    break;
                }
            }

            sb.append(index + 1).append("\n");
        }

        System.out.println(sb);
    }
}