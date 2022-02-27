import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());
        long Z = getZ(X, Y);

        if (Z >= 99) {
            System.out.println(-1);
        }
        else {
            long answer = 0;
            long low = 0;
            long mid;
            long high = (long) 1e9;

            while (low <= high) {
                mid = (low + high) / 2;

                if (Z != getZ(X + mid, Y + mid)) {
                    answer = mid;
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            System.out.println(answer);
        }
    }

    static int getZ(long x, long y) {
        return (int) Math.floor((double) (y * 100) / x);
    }
}