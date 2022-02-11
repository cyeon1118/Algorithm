import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            n = Integer.parseInt(br.readLine());

            if (n < 40) {
                n = 40;
            }

            sum += n;
        }

        System.out.println(sum / 5);
    }
}