import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int min = 100;
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            n = Integer.parseInt(br.readLine());

            if (n % 2 != 0) {
                sum += n;

                if (min > n) {
                    min = n;
                }
            }
        }

        if (sum != 0) {
            System.out.println(sum);
        }

        if (min == 100) {
            System.out.println(-1);
        }
        else {
            System.out.println(min);
        }
    }
}