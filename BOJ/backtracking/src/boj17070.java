import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj17070 {

	static int N, cnt;
	static int[][] map;
	static boolean[][] visited;

	static int[] dx = {0, 1, 1};
	static int[] dy = {1, 0, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		map = new int[N + 1][N + 1];
		visited = new boolean[N + 1][N + 1];

		for (int r = 1; r < N + 1; r++) {
			st = new StringTokenizer(br.readLine());

			for (int c = 1; c < N + 1; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());
			}
		}

		cnt = 0;
		visited[1][1] = true;

		dfs(new Point(1, 2), 0);

		System.out.println(cnt);
	}

	static void dfs(Point p, int flag) {
		if (p.x == N && p.y == N) {
			cnt++;
			return;
		}

		visited[p.x][p.y] = true;

		for (int i = 0; i < 3; i++) {
			if (flag == 0) {
				if (i == 1) {
					continue;
				}
			} else if (flag == 1) {
				if (i == 0) {
					continue;
				}
			}

			int tempR = p.x + dx[i];
			int tempC = p.y + dy[i];

			if (tempR >= 1 && tempC >= 1 && tempR < N + 1 && tempC < N + 1) {
				if (map[tempR][tempC] != 1) {
					if (!visited[tempR][tempC]) {
						if (i == 2) {
							if (!visited[tempR][tempC - 1] && !visited[tempR - 1][tempC]) {
								if (map[tempR][tempC - 1] != 1 && map[tempR - 1][tempC] != 1) {
									visited[tempR][tempC - 1] = true;
									visited[tempR - 1][tempC] = true;

									visited[tempR][tempC] = true;
									dfs(new Point(tempR, tempC), i);
									visited[tempR][tempC] = false;

									visited[tempR][tempC - 1] = false;
									visited[tempR - 1][tempC] = false;
								}
							}
						} else {
							visited[tempR][tempC] = true;
							dfs(new Point(tempR, tempC), i);
							visited[tempR][tempC] = false;
						}
					}
				}
			}
		}
	}

	static class Point {

		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}