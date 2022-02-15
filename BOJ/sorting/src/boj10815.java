import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj10815 {
    static int[] nNum;
    static int[] mNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N, M;
        int result;

        N = Integer.parseInt(br.readLine());
        nNum = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nNum[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nNum);

        M = Integer.parseInt(br.readLine());
        mNum = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < M; j++) {
            mNum[j] = Integer.parseInt(st.nextToken());
        }

        for (int k = 0; k < M; k++) {
            result = binarySearch(k);
            sb.append(result).append(" ");
        }

        System.out.println(sb);
    }

    static int binarySearch(int num) {
        int low = 0;
        int high = nNum.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (nNum[mid] < mNum[num]) {
                low = mid + 1;
            }
            else if (nNum[mid] == mNum[num]) {
                return 1;
            }
            else {
                high = mid - 1;
            }
        }

        return 0;
    }
}