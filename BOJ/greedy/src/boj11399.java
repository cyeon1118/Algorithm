import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] time = new int[N];
        int sum = 0;
        int pre = 0;
        int temp;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time);

        for (int j = 0; j < N; j++) {
            temp = pre + time[j];
            sum += temp;
            pre = temp;
        }

        System.out.println(sum);
    }
}