import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] ESM = new int[3];

        for (int i = 0; i < 3; i++) {
            ESM[i] = Integer.parseInt(st.nextToken());
        }

        int E = 0;
        int S = 0;
        int M = 0;
        int year = 0;

        while (true) {
            year++;

            if (E == 15) {
                E = 0;
            }
            if (S == 28) {
                S = 0;
            }
            if (M == 19) {
                M = 0;
            }

            E++;
            S++;
            M++;

            if (E == ESM[0]) {
                if (S == ESM[1]) {
                    if (M == ESM[2]) {
                        break;
                    }
                }
            }
        }

        System.out.println(year);
    }
}