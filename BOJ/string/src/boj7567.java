import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj7567 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();

        int h = 10;

        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(i - 1)) {
                h += 5;
            }
            else {
                h += 10;
            }
        }

        System.out.println(h);
    }
}