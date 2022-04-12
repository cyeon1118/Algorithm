import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);

        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) - 'a';

            if (alphabet[index] == -1) {
                alphabet[index] = i;
            }
        }

        for (int j = 0; j < 26; j++) {
            sb.append(alphabet[j]).append(" ");
        }

        System.out.println(sb);
    }
}