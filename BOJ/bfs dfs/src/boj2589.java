import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj2589 {

	static int H, W, max;

	static int[][] map;

	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		H = Integer.parseInt(st.nextToken());
		W = Integer.parseInt(st.nextToken());

		map = new int[W][H];

		for (int i = 0; i < H; i++) {
			String str = br.readLine();

			for (int j = 0; j < W; j++) {
				char c = str.charAt(j);
				if (c == 'W') {
					map[j][i] = 0;
				} else if (c == 'L') {
					map[j][i] = 1;
				}
			}
		}

		max = Integer.MIN_VALUE;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				if (map[j][i] == 1) {
					bfs(new Point(j, i, 0));
				}
			}
		}

		System.out.println(max);
	}

	static void bfs(Point point) {
		boolean[][] visited = new boolean[W][H];

		Queue<Point> queue = new ArrayDeque<>();
		queue.add(point);
		visited[point.x][point.y] = true;

		while (!queue.isEmpty()) {
			Point p = queue.poll();

			for (int i = 0; i < 4; i++) {
				int tempX = p.x + dx[i];
				int tempY = p.y + dy[i];

				if (tempX < 0 || tempX >= W || tempY < 0 || tempY >= H) {
					continue;
				}

				if (map[tempX][tempY] == 0) {
					continue;
				}

				if (!visited[tempX][tempY]) {
					visited[tempX][tempY] = true;
					queue.add(new Point(tempX, tempY, p.len + 1));
					max = Math.max(max, p.len + 1);
				}
			}
		}
	}

	static class Point {

		int x, y, len;

		Point(int x, int y, int len) {
			this.x = x;
			this.y = y;
			this.len = len;
		}
	}
}