import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] angle = new int[3];
        int sum = 0;
        int cnt = 0;
        boolean flag = true;

        for (int i = 0; i < 3; i++) {
            angle[i] = Integer.parseInt(br.readLine());
            sum += angle[i];

            if (angle[i] != 60) {
                flag = false;
            }
        }

        if (angle[0] == angle[1]) {
            cnt++;
        }
        if (angle[1] == angle[2]) {
            cnt++;
        }
        if (angle[0] == angle[2]) {
            cnt++;
        }

        if (!flag) {
            if (sum == 180) {
                if (cnt == 0) {
                    System.out.println("Scalene");
                }
                else {
                    System.out.println("Isosceles");
                }
            }
            else {
                System.out.println("Error");
            }
        }
        else {
            System.out.println("Equilateral");
        }
    }
}