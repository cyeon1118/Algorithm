import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1654 {
    static long K, N;
    static long[] lan;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        lan = new long[(int) K];
        for (int i = 0; i < K; i++) {
            lan[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(lan);

        long result = binarySearch(lan[lan.length - 1]);

        System.out.println(result);
    }

    static long binarySearch(long max) {
        long low = 1;
        long high = max;
        long mid;
        int cnt;
        long maxMid = 0;

        while (low <= high) {
            cnt = 0;
            mid = (low + high) / 2;

            for (int j = 0; j < K; j++) {
                cnt += lan[j] / mid;
            }

            if (cnt >= N) {
                low = mid + 1;
                if (maxMid < mid) {
                    maxMid = mid;
                }
            }
            else {
                high = mid - 1;
            }
        }

        return maxMid;
    }
}