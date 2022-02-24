import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int A, B;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " ");

            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            sb.append(A + B).append("\n");
        }

        System.out.println(sb);
    }
}