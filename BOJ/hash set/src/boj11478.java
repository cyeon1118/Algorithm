import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class boj11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < S.length(); i++) {
            hashSet.add(String.valueOf(S.charAt(i)));
            for (int j = i + 1; j < S.length() + 1; j++) {
                hashSet.add(S.substring(i, j));
            }
        }

        System.out.println(hashSet.size());
    }
}