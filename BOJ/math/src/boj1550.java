import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = Integer.parseInt(br.readLine(), 16);
        System.out.println(result);
    }
}