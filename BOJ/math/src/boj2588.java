import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());

        int result = n1 * n2;

        while (n2 != 0) {
            sb.append(n1 * (n2 % 10)).append("\n");
            n2 /= 10;
        }

        sb.append(result);

        System.out.println(sb);
    }
}