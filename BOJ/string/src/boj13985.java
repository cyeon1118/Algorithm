import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj13985 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        String operator = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        st.nextToken();
        int c = Integer.parseInt(st.nextToken());

        int result;
        switch (operator) {
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                result = a + b;
                break;
        }

        if (c == result) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}