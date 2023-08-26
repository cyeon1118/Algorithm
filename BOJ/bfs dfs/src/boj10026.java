import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10026 {

	static int N;
	static int cnt = 0;
	static int cntRG = 0;

	static char[][] color;
	static boolean[][] visited;
	static boolean[][] visitedRG;

	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		color = new char[N][N];
		visited = new boolean[N][N];
		visitedRG = new boolean[N][N];

		for (int i = 0; i < N; i++) {
			String s = br.readLine();

			for (int j = 0; j < N; j++) {
				color[i][j] = s.charAt(j);
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					cnt++;
					dfs(i, j);
				}
				if (!visitedRG[i][j]) {
					cntRG++;
					dfs(i, j, color[i][j]);
				}
			}
		}

		System.out.println(cnt + " " + cntRG);
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nowX = dx[i] + x;
			int nowY = dy[i] + y;

			if (nowX >= 0 && nowY >= 0 && nowX < N && nowY < N) {
				if (!visited[nowX][nowY]) {
					if (color[x][y] == color[nowX][nowY]) {
						visited[nowX][nowY] = true;
						dfs(nowX, nowY);
					}
				}
			}
		}
	}

	static void dfs(int x, int y, char c) {
		visitedRG[x][y] = true;

		for (int i = 0; i < 4; i++) {
			int nowX = dx[i] + x;
			int nowY = dy[i] + y;

			if (nowX >= 0 && nowY >= 0 && nowX < N && nowY < N) {
				if (!visitedRG[nowX][nowY]) {
					if (c == 'B') {
						if (color[nowX][nowY] == c) {
							visitedRG[nowX][nowY] = true;
							dfs(nowX, nowY, c);
						}
					} else {
						if (color[nowX][nowY] != 'B') {
							visitedRG[nowX][nowY] = true;
							dfs(nowX, nowY, c);
						}
					}
				}
			}
		}
	}
}