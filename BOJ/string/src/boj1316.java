import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1316 {
    static boolean[] alphabet;
    static String word;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            alphabet = new boolean[26];
            word = br.readLine();

            if (checkWord()) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    static boolean checkWord() {
        int start = 0;
        int temp;
        boolean flag = true;

        for (int j = 0; j < word.length(); j++) {
            temp = word.charAt(j);

            if (start != temp) {
                if (!alphabet[temp - 'a']) {
                    alphabet[temp - 'a'] = true;
                    start = temp;
                }
                else {
                    flag = false;
                }
            }
        }

        return flag;
    }
}