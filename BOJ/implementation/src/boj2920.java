import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] sound = new int[8];

        for (int i = 0; i < 8; i++) {
            sound[i] = Integer.parseInt(st.nextToken());
        }

        if (sound[0] == 1) {
            boolean ascending = true;

            for (int j = 1; j < 9; j++) {
                if (sound[j - 1] != j) {
                    ascending = false;
                    break;
                }
            }
            if (ascending) {
                System.out.println("ascending");
            }
            else {
                System.out.println("mixed");
            }
        }

        else if (sound[0] == 8) {
            boolean descending = true;

            for (int j = 8; j > 0; j--) {
                if (sound[8 - j] != j) {
                    descending = false;
                    break;
                }
            }

            if (descending) {
                System.out.println("descending");
            }
            else {
                System.out.println("mixed");
            }
        }

        else {
            System.out.println("mixed");
        }
    }
}