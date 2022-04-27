import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] num = new int[4];

        int min = num[0] = Integer.parseInt(st.nextToken());
        num[1] = Integer.parseInt(st.nextToken());
        num[2] = Math.abs(Integer.parseInt(st.nextToken()) - num[0]);
        num[3] = Math.abs(Integer.parseInt(st.nextToken()) - num[1]);

        for (int i = 1; i < 4; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }

        System.out.println(min);
    }
}