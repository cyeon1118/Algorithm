import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11943 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = 0;
        int B = 0;

        A += Integer.parseInt(st.nextToken());
        B += Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        B += Integer.parseInt(st.nextToken());
        A += Integer.parseInt(st.nextToken());

        System.out.println(Math.min(A, B));
    }
}