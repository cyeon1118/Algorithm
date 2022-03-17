import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ASCII = br.readLine().charAt(0);

        System.out.println(ASCII);
    }
}