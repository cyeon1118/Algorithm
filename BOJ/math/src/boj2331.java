import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class boj2331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        HashSet<Integer> num = new HashSet<>();
        num.add(A);

        boolean flag = false;

        while (true) {
            A = nPow(A, P);

            if (!num.contains(A)) {
                if (flag) {
                    break;
                }
                num.add(A);
            }
            else {
                num.remove(A);
                flag = true;
            }
        }

        System.out.println(num.size());
    }

    static int nPow(int a, int p) {
        int n = 0;

        do {
            n += Math.pow(a % 10, p);
            a /= 10;
        } while (a != 0);

        return n;
    }
}