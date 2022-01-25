import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sqrt;
        int index = -1;
        int[] result = new int[101];

        for (int i = M ; i < N + 1 ; i++) {
            sqrt = (int)Math.sqrt(i);
            if (sqrt == Math.sqrt(i)) {
                result[++index] = i;
            }
        }

        if (index == -1) {
            System.out.println(-1);
        }
        else {
            int sum = 0;
            for (int j = 0 ; j < index + 1 ; j++) {
                sum += result[j];
            }
            System.out.println(sum);
            System.out.println(result[0]);
        }
    }
}