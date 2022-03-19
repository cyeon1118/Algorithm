import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2980 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int temp, oldD;
        int D = 0;
        int R, G;
        boolean flag;

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            temp = 0;
            flag = false;
            oldD = D;

            st = new StringTokenizer(br.readLine());
            D = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            G = Integer.parseInt(st.nextToken());

            sum += D - oldD;

            while (temp <= sum) {
                if (!flag) {
                    temp += R;
                    flag = true;
                }
                else {
                    temp += G;
                    flag = false;
                }
            }

            if (flag) {
                sum += temp - sum;
            }
        }

        sum += L - D;

        System.out.println(sum);
    }
}