import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int mul = 1;

        while (N != 0) {
            mul *= N--;
        }

        System.out.println(mul);
    }
}