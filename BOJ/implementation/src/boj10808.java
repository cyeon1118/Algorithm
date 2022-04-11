import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, 0);

        for (int i = 0; i < str.length(); i++) {
            alphabet[str.charAt(i) - 'a']++;
        }

        for (int j = 0; j < 26; j++) {
            sb.append(alphabet[j]).append(" ");
        }

        System.out.println(sb);
    }
}