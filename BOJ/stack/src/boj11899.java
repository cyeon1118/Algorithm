import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj11899 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		Stack<Character> left = new Stack<>();
		int cnt = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				left.push('(');
			}
			else {
				if (left.isEmpty()) {
					cnt++;
				}
				else {
					left.pop();
				}
			}
		}

		if (!left.isEmpty()) {
			while (!left.isEmpty()) {
				left.pop();
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}