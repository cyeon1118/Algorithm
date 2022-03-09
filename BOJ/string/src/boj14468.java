import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj14468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[][] check = new int[26][2];
        int cnt = 0;

        for (int i = 0; i < 52; i++) {
            int s = str.charAt(i) - 'A';

            if (check[s][0] == 0) {
                check[s][0] = i + 1;
            }
            else {
                check[s][1] = i + 1;
            }
        }

        for (int j = 0; j < 26; j++) {
            for (int k = 0; k < 26; k++) {
                if (check[j][0] < check[k][0]) {
                    if (check[j][1] > check[k][0]) {
                        if (check[j][1] < check[k][1]) {
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}