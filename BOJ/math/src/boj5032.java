import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj5032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int change = (e + f) / c;
        int unChange = (e + f) % c;
        int result = change;
        int newChange;
        while (change + unChange >= c) {
            newChange = (change + unChange) / c;
            unChange = (change + unChange) % c;
            change = newChange;
            result += newChange;
        }
        System.out.println(result);
    }
}