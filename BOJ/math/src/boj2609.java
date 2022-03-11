import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int gcd = 1;
        int lcm;
        int i = 2;

        while (A >= i || B >= i) {
            if (A % i == 0 && B % i == 0) {
                gcd *= i;
                A /= i;
                B /= i;
                i = 2;
            }
            else {
                i++;
            }
        }

        lcm = gcd * A * B;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}