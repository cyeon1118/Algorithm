import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        String str, temp;
        int left, right;

        for (int i = 0; i < T; i++) {
            left = 0;
            right = 0;

            str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                stack.add(String.valueOf(str.charAt(j)));
            }

            while (!stack.isEmpty()) {
                temp = stack.pop();

                if (temp.equals("(")) {
                    left++;
                    if (left > right) {
                        break;
                    }
                }
                else if (temp.equals(")")) {
                    right++;
                }
            }

            if (left == right) {
                sb.append("YES\n");
            }
            else {
                sb.append("NO\n");
            }

            stack.clear();
        }

        System.out.println(sb);
    }
}