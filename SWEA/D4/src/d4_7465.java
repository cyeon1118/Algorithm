import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class d4_7465 {

	static int N, M;
	static int[][] graph;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine().trim());

		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine().trim());

			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			graph = new int[N + 1][N + 1];
			visited = new boolean[N + 1];

			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine().trim());

				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());

				graph[start][end] = graph[end][start] = 1;
			}

			int cnt = 0;

			for (int i = 1; i <= N; i++) {
				if (!visited[i]) {
					bfs(i);
					cnt++;
				}
			}

			sb.append("#").append(t + 1).append(" ").append(cnt).append("\n");
		}

		System.out.println(sb);
	}

	static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();

		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int temp = queue.poll();

			for (int i = 1; i <= N; i++) {
				if (!visited[i] && graph[temp][i] != 0) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}
}