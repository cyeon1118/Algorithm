import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] num = new int[3];
        for (int i = 0 ; i < 3 ; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        for (int j = 0 ; j < 3 ; j++) {
            if (str.charAt(j) == 'A'){
                sb.append(num[0]).append(" ");
            }
            else if (str.charAt(j) == 'B') {
                sb.append(num[1]).append(" ");
            }
            else {
                sb.append(num[2]).append(" ");
            }
        }

        System.out.println(sb);
    }
}