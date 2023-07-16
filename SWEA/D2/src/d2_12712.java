import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d2_12712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int max = 0;
			int[][] num = new int[3 * N][3 * N];

			for (int i = N; i < 2 * N; i++) {
				st = new StringTokenizer(br.readLine());

				for (int j = N; j < 2 * N; j++) {
					num[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = N; i < 2 * N; i++) {
				for (int j = N; j < 2 * N; j++) {
					int sum = 0;

					for (int k = 1 - M; k <= M - 1; k++) {
						sum += num[i + k][j] + num[i][j + k];
					}

					sum -= num[i][j];

					max = Math.max(max, sum);

					sum = 0;

					for (int k = 1 - M; k <= M - 1; k++) {
						sum += num[i - k][j + k] + num[i + k][j + k];
					}

					sum -= num[i][j];

					max = Math.max(max, sum);
				}
			}

			sb.append("#").append(t + 1).append(" ").append(max).append("\n");
		}

		System.out.println(sb);
	}
}