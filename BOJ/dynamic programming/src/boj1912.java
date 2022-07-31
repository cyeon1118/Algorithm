import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int max;
        int[] num = new int[n];
        int[] maxList = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        maxList[0] = num[0];
        max = maxList[0];

        for (int i = 1; i < n; i++) {
            maxList[i] = Math.max(maxList[i - 1] + num[i], num[i]);
            max = Math.max(max, maxList[i]);
        }

        System.out.println(max);
    }
}