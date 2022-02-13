import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class boj5568 {
    public static int[] num;
    public static HashSet<String> output = new HashSet<>();
    public static boolean[] visited;
    public static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        num = new int[n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        perm(0, "");

        System.out.println(output.size());
    }

    public static void perm(int index, String s) {
        if (index == k) {
            output.add(s);
            return;
        }

        if (index > n) {
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                perm(index + 1, s + num[i]);
                visited[i] = false;
            }
        }
    }
}