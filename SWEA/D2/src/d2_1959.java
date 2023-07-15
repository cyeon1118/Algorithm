import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d2_1959 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[] A = new int[N];
			int[] B = new int[M];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				B[j] = Integer.parseInt(st.nextToken());
			}

			int max = -999999999;

			if (N > M) {
				for (int k = 0; k <= N - M; k++) {
					int sum = 0;

					for (int l = 0; l < M; l++) {
						sum += A[l + k] * B[l];
					}

					max = Math.max(max, sum);
				}
			}
			else if (N < M) {
				for (int k = 0; k <= M - N; k++) {
					int sum = 0;

					for (int l = 0; l < N; l++) {
						sum += A[l] * B[l + k];
					}

					max = Math.max(max, sum);
				}
			}
			else {
				for (int k = 0; k < N; k++) {
					max += A[k] * B[k];
				}
			}

			sb.append("#").append(t + 1).append(" ").append(max).append("\n");
		}

		System.out.println(sb);
	}
}