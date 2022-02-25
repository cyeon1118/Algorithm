import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class boj1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Integer, String> num = new HashMap<>(10001);
        int N = Integer.parseInt(br.readLine());

        int key = 0;
        int n = 666;
        String str;

        do {
            str = n + "";

            if (str.contains("666")) {
                num.put(key++, str);
            }

            n++;
        } while (key != 10000);

        System.out.println(num.get(N - 1));
    }
}