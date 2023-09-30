import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15652 {

	static int N, M;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		int[] result = new int[M];

		dfs(result, 1, 0);

		System.out.println(sb);
	}

	static void dfs(int[] result, int start, int depth) {
		if (depth == M) {
			for (int d = 0; d < result.length; d++) {
				sb.append(result[d]).append(" ");
			}

			sb.append("\n");

			return;
		}

		for (int d = start; d <= N; d++) {
			result[depth] = d;
			dfs(result, start, depth + 1);
			start++;
		}
	}
}