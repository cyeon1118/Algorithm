import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj2667 {

	static int N;
	static int cnt = 0;
	static int num = 0;
	static int[][] apt;
	static boolean[][] visited;

	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		apt = new int[N][N];
		visited = new boolean[N][N];
		ArrayList<Integer> cntArr = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String str = br.readLine(); // 숫자가 공백으로 떨어져 있지 않으므로..!

			for (int j = 0; j < N; j++) {
				apt[i][j] = str.charAt(j) - '0';
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (apt[i][j] == 1 && !visited[i][j]) {
					cnt = 0;
					num++;
					dfs(i, j);
					cntArr.add(cnt);
				}
			}
		}

		System.out.println(num);

		Collections.sort(cntArr);

		for (int i = 0; i < cntArr.size(); i++) {
			System.out.println(cntArr.get(i));
		}
	}

	static void dfs(int x, int y) {
		visited[x][y] = true;
		apt[x][y] = num;
		cnt++;

		for (int i = 0; i < 4; i++) {
			int nowX = dx[i] + x;
			int nowY = dy[i] + y;

			if (nowX >= 0 && nowY >= 0 && nowX < N && nowY < N) {
				if (apt[nowX][nowY] == 1 && !visited[nowX][nowY]) {
					visited[nowX][nowY] = true;
					apt[nowX][nowY] = num;

					dfs(nowX, nowY);
				}
			}
		}
	}
}
