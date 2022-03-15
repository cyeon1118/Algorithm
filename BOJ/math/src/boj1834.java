import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long sum = 0;

        for (int i = 1; i < N; i++) {
            sum += (long) (N + 1) * i;
        }

        System.out.println(sum);
    }
}