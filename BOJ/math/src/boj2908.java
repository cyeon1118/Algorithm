import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s1 = st.nextToken();
        String s2 = st.nextToken();

        StringBuilder S1 = new StringBuilder();
        StringBuilder S2 = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            S1.append(s1.charAt(i));
            S2.append(s2.charAt(i));
        }

        int max = Math.max(Integer.parseInt(String.valueOf(S1)), Integer.parseInt(String.valueOf(S2)));

        System.out.println(max);
    }
}