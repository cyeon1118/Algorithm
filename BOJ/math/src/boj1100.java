import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1100 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[][] map = new boolean[8][8];

		for (int i = 0; i < 8; i++) {
			String str = br.readLine();

			for (int j = 0; j < 8; j++) {
				if (String.valueOf(str.charAt(j)).equals("F")) {
					map[i][j] = true;
				}

			}
		}

		int cnt = 0;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (map[i][j]) {
					if (i % 2 == 0 && j % 2 == 0) {
						cnt++;
					}
					else if (i % 2 == 1 && j % 2 == 1) {
						cnt++;
					}
				}
			}
		}

		System.out.println(cnt);
	}
}