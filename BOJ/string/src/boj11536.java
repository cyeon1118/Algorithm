import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11536 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] str = new String[N];
        boolean[] compareStr = new boolean[N - 1];
        boolean flag = true;

        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
        }

        for (int j = 0; j < str.length - 1; j++) {
            if (str[j].compareTo(str[j + 1]) < 0) {
                compareStr[j] = false;
            }
            else {
                compareStr[j] = true;
            }
        }

        if (compareStr[0]) {
            for (int k = 1; k < compareStr.length; k++) {
                if (!compareStr[k]) {
                    flag = false;
                    sb.append("NEITHER");
                    break;
                }
            }

            if (flag) {
                sb.append("DECREASING");
            }
        }
        else {
            for (int l = 1; l < compareStr.length; l++) {
                if (compareStr[l]) {
                    flag = false;
                    sb.append("NEITHER");
                    break;
                }
            }

            if (flag) {
                sb.append("INCREASING");
            }
        }

        System.out.println(sb);
    }
}