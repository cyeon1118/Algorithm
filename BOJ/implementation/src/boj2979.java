import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj2979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] parkingTime = new int[101];
        Arrays.fill(parkingTime, 0);

        int in;
        int out;
        int parkingFee = 0;

        for (int i = 0 ; i < 3 ; i++) {
            st = new StringTokenizer(br.readLine());
            in = Integer.parseInt(st.nextToken());
            out = Integer.parseInt(st.nextToken());

            for (int j = in ; j < out ; j++) {
                parkingTime[j]++;
            }
        }

        for (int k = 0 ; k < 101 ; k++) {
            if (parkingTime[k] == 1) {
                parkingFee += A;
            }
            else if (parkingTime[k] == 2) {
                parkingFee += 2 * B;
            }
            else if (parkingTime[k] == 3) {
                parkingFee += 3 * C;
            }
        }

        System.out.println(parkingFee);
    }
}