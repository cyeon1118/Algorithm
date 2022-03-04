import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj3135 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int sub = Math.abs(A - B);

        int N = Integer.parseInt(br.readLine());
        int[] button = new int[N];
        for (int i = 0; i < N; i++) {
            button[i] = Math.abs(B - Integer.parseInt(br.readLine()));
        }

        int min = sub;
        boolean flag = false;
        for (int j = 0; j < button.length; j++) {
            if (min > button[j]) {
                flag = true;
                min = button[j];
            }
        }

        if (!flag) {
            System.out.println(sub);

        }
        else {
            System.out.println(min + 1);
        }
    }
}