import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj6603 {

	static int N;
	static int M = 6;
	static int[] num;
	static boolean[] visited;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		sb = new StringBuilder();

		while (true) {
			st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());

			if (N == 0) {
				break;
			}

			M = 6;

			num = new int[N];
			visited = new boolean[N];
			int[] result = new int[M];

			for (int i = 0; i < N; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(num);

			dfs(result, 0, 0);

			sb.append("\n");
		}

		System.out.println(sb);
	}

	static void dfs(int[] result, int depth, int start) {
		if (depth == M) {
			for (int i : result) {
				sb.append(i).append(" ");
			}

			sb.append("\n");
			return;
		}

		for (int d = start; d < N; d++) {
			if (!visited[d]) {
				visited[d] = true;
				result[depth] = num[d];
				dfs(result, depth + 1, d);
				visited[d] = false;
			}
		}
	}
}