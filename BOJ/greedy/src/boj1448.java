import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj1448 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] straw = new int[N];
        int sum;
        int max = -1;

        for (int i = 0; i < N; i++) {
            straw[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(straw);

        for (int j = N - 1; j >= 2; j--) {
            if (straw[j - 2] + straw[j - 1] > straw[j]) {
                sum = straw[j] + straw[j - 1] + straw[j - 2];
                if (max < sum) {
                    max = sum;
                }
            }
        }

        if (max < 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(max);
        }
    }
}