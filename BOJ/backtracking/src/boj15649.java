import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15649 {

	static int N, M;
	static int[] arr;
	static boolean[] visited;

	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M + 1];
		visited = new boolean[N + 1];
		sb = new StringBuilder();

		dfs(0);

		System.out.println(sb);
	}

	static void dfs(int index) {
		if (index == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i]).append(" ");
			}

			sb.append("\n");
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[index] = i;

				dfs(index + 1);

				visited[i] = false;
			}
		}
	}
}