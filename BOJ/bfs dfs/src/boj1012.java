import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1012 {

	static int M, N;
	static int cnt = 0;

	static int[][] map;
	static boolean[][] visited;

	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());

			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			map = new int[M][N];
			visited = new boolean[M][N];

			cnt = 0;

			for (int j = 0; j < num; j++) {
				st = new StringTokenizer(br.readLine());

				map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}

			for (int j = 0; j < M; j++) {
				for (int k = 0; k < N; k++) {
					if (map[j][k] == 1 && !visited[j][k]) {
						cnt++;
						dfs(j, k);
					}
				}
			}

			sb.append(cnt).append("\n");
		}

		System.out.println(sb);
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nowX = dx[i] + x;
			int nowY = dy[i] + y;

			if (nowX >= 0 && nowY >= 0 & nowX < M && nowY < N) {
				if (map[nowX][nowY] == 1 && !visited[nowX][nowY]) {
					visited[nowX][nowY] = true;
					dfs(nowX, nowY);
				}
			}
		}

	}
}