import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[] line = new int[3];
        int a, b, c;

        while (true) {
            st = new StringTokenizer(br.readLine());

            line[0] = Integer.parseInt(st.nextToken());
            line[1] = Integer.parseInt(st.nextToken());
            line[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(line);

            a = line[0];
            b = line[1];
            c = line[2];

            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            else {
                if (a > 0 && b > 0 && c > 0) {
                    if (a * a + b * b == c * c) {
                        sb.append("right\n");
                    }
                    else {
                        sb.append("wrong\n");
                    }
                }
                else {
                    sb.append("wrong\n");
                }
            }
        }

        System.out.println(sb);
    }
}