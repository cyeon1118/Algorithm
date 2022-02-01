import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> num = new ArrayList<>();
        int n;
        boolean flag;
        int cnt = 0;

        while (N != 0) {
            num.clear();
            n = N;
            flag = true;

            while (n != 0) {
                num.add(n % 10);
                n = n / 10;
            }

            for (int i = 0; i < num.size() - 2; i++) {
                if (num.get(i) - num.get(i + 1) != num.get(i + 1) - num.get(i + 2)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                cnt++;
            }

            N--;
        }

        System.out.println(cnt);
    }
}