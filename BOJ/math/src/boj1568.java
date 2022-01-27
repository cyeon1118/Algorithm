import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int K = 1;
        int cnt = 0;

        while (N != 0) {
            if (K > N) {
                K = 1;
            }
            N -= K++;
            cnt++;
        }

        System.out.println(cnt);
    }
}