import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5597 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] students = new int[31];

		for (int i = 0; i < 28; i++) {
			students[Integer.parseInt(br.readLine().trim())]++;
		}

		for (int i = 1; i <= 30; i++) {
			if (students[i] == 0) {
				sb.append(i).append("\n");
			}
		}

		System.out.println(sb);
	}
}