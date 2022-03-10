import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1769 {
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String N = br.readLine();

        boolean flag = sum(N);

        if (flag) {
            sb.append(cnt).append("\n").append("YES");
        }
        else {
            sb.append(cnt).append("\n").append("NO");
        }

        System.out.println(sb);
    }

    static boolean sum(String n) {
        long sum;
        cnt = 0;

        while (n.length() != 1) {
            sum = 0;

            for (int i = 0; i < n.length(); i++) {
                sum += Integer.parseInt(String.valueOf(n.charAt(i)));
            }

            cnt++;
            n = String.valueOf(sum);
        }

        return Integer.parseInt(n) % 3 == 0;
    }
}