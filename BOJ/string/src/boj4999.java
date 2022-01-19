import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String jh = br.readLine();
        String doc = br.readLine();

        if (doc.length() <= jh.length()) {
            System.out.println("go");
        }
        else {
            System.out.println("no");
        }
    }
}
