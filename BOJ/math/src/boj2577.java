import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        long mul = (long) A * B * C;
        String n = String.valueOf(mul);

        int[][] num = new int[10][2];

        for (int i = 0; i < 10; i++) {
            num[i][0] = i;
            num[i][1] = 0;
        }

        for (int j = 0; j < n.length(); j++) {
            num[Integer.parseInt(String.valueOf(n.charAt(j)))][1]++;
        }

        for (int k = 0; k < num.length; k++) {
            System.out.println(num[k][1]);
        }
    }
}