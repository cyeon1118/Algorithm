import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int n = 0;
        int num = 665;

        do {
            if (String.valueOf(++num).contains("666")) {
                n++;
            }
        } while (n != N);

        System.out.println(num);
    }
}