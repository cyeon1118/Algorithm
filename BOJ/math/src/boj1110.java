import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int a, b, c, d = -1;
        int n = N;
        int cnt = 0;

        while(N != d){
            a = n / 10;
            b = n % 10;
            c = a + b;
            d = (b * 10) + (c % 10);

            cnt++;
            n = d;
        }
        System.out.println(cnt);
    }
}
