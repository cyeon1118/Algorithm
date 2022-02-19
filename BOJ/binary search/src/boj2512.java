import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2512 {
    static int N;
    static int[] loc;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        loc = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            loc[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());

        Arrays.sort(loc);

        int result = binarySearch(loc[loc.length - 1]);

        System.out.println(result);
    }

    static int binarySearch(int n) {
        int low = 1;
        int high = n;
        int mid;
        int maxMid = 0;
        int budget;
        int maxBudget = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            budget = 0;

            for (int j = 0; j < N; j++) {
                budget += Math.min(loc[j], mid);
            }

            if (budget > M) {
                high = mid - 1;
            }
            else if (budget == M) {
                maxMid = mid;
                break;
            }
            else {
                low = mid + 1;

                if (maxBudget < budget) {
                    maxBudget = budget;
                    maxMid = mid;
                }
            }
        }

        return maxMid;
    }
}