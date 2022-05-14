import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int ko = A / C;
        int math = B / D;

        if (A % C != 0) {
            ko++;
        }
        if (B % D != 0) {
            math++;
        }

        System.out.println(L - Math.max(ko, math));
    }
}