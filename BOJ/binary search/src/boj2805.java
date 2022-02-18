import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2805 {
    static long N, M;
    static long[] tree;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Long.parseLong(st.nextToken());
        M = Long.parseLong(st.nextToken());

        tree = new long[(int) N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(tree);

        long result = binarySearch(tree[tree.length - 1]);

        System.out.println(result);
    }

    static long binarySearch(long len) {
        long low = 1;
        long high = len;
        long mid;
        long extra;
        long maxMid = 0;

        while (low <= high) {
            extra = 0;
            mid = (low + high) / 2;

            for (int j = 0; j < N; j++) {
                if (tree[j] >= mid) {
                    extra += tree[j] - mid;
                }
            }

            if (extra > M) {
                low = mid + 1;

                if (maxMid < mid) {
                    maxMid = mid;
                }
            }
            else if (extra == M) {
                maxMid = mid;
                break;
            }
            else {
                high = mid - 1;
            }
        }

        return maxMid;
    }
}