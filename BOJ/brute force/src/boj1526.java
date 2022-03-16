import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1526 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean flag;

        for (int i = N; i >= 4; i--) {
            flag = true;
            String str = String.valueOf(i);

            for (int j = 0; j < str.length(); j++) {
                char s = str.charAt(j);
                if (s != '4' && s != '7') {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i);
                break;
            }
        }
    }
}