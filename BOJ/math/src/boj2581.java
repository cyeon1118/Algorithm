import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;

        for (int i = M; i <= N; i++) {
            if (i != 1) {
                if (checkNum(i)) {
                    if (sum == 0) {
                        min = i;
                    }
                    sum += i;
                }
            }
        }

        if (min != 0) {
            System.out.println(sum);
            System.out.println(min);
        }
        else {
            System.out.println(-1);
        }
    }

    static boolean checkNum(int n) {
        int cnt = 0;

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;
            }
        }

        return cnt == 0;
    }
}