import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9316 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			sb.append("Hello World, Judge ").append(i + 1).append("!").append("\n");
		}

		System.out.println(sb);
	}
}