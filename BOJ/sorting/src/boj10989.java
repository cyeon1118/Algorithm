import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] num = new int[10001];

        for (int i = 0; i < N; i++) {
            num[Integer.parseInt(br.readLine())]++;
        }

        for (int j = 0; j < num.length; j++) {
            if (num[j] > 0) {
                while (num[j] != 0) {
                    sb.append(j).append("\n");
                    num[j]--;
                }
            }
        }

        System.out.println(sb);
    }
}