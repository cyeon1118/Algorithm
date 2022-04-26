import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a == b && b == c) {
            sb.append(10000 + a * 1000);
        }
        else if (a != b && b != c && c != a) {
            sb.append(Math.max(a, Math.max(b, c)) * 100);
        }
        else {
            if (a != b) {
                sb.append(1000 + c * 100);
            }
            else{
                sb.append(1000 + b * 100);
            }
        }

        System.out.println(sb);
    }
}