import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d1_2072 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			int sum = 0;

			st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens()) {
				int temp = Integer.parseInt(st.nextToken());

				if (temp % 2 != 0) {
					sum += temp;
				}
			}

			sb.append("#").append(test_case).append(" ").append(sum).append("\n");
		}

		System.out.println(sb);
	}
}