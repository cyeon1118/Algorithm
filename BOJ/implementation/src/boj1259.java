import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		StringBuilder result = new StringBuilder();

		String s = br.readLine();

		while (!s.equals("0")) {
			StringBuilder reverseSb = new StringBuilder(s).reverse();
			String reverse = reverseSb.toString();

			if (s.equals(reverse)) {
				result.append("yes").append("\n");
			}
			else {
				result.append("no").append("\n");
			}

			s = br.readLine();
		}

		System.out.println(result);
	}
}