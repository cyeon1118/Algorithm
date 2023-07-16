import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class d2_1974 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int[][] nums = new int[9][9];

			for (int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine());

				for (int j = 0; j < 9; j++) {
					nums[j][i] = Integer.parseInt(st.nextToken());
				}
			}

			sb.append("#").append(t + 1).append(" ");

			if (!lineCheck(nums)) {
				sb.append(0).append("\n");
			}
			else {
				if (!squareCheck(nums)) {
					sb.append(0).append("\n");
				}
				else {
					sb.append(1).append("\n");
				}
			}
		}

		System.out.println(sb);
	}

	static Boolean lineCheck(int[][] arr) {
		int[] checkHorizon = new int[9];
		int[] checkVertical = new int[9];

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				checkHorizon[j] = arr[j][i];
				checkVertical[j] = arr[i][j];
			}

			Arrays.sort(checkHorizon);
			Arrays.sort(checkVertical);

			for (int j = 1; j < 10; j++) {
				if (checkHorizon[j - 1] != j) {
					return false;
				}
				if (checkVertical[j - 1] != j) {
					return false;
				}
			}
		}

		return true;
	}

	static Boolean squareCheck(int[][] arr) {
		int x = 0;
		int y = 0;
		int[] checkArr = new int[9];

		do {
			int n = 0;

			for (int i = x; i < x + 3; i++) {
				for (int j = 0; j < 3; j++) {
					checkArr[n++] = arr[i][j + y];
				}
			}

			Arrays.sort(checkArr);

			for (int j = 1; j < 10; j++) {
				if (checkArr[j - 1] != j) {
					return false;
				}
			}

			x += 3;

			if (x >= 8) {
				x = 0;
				y += 3;
			}
		} while (y <= 8);

		return true;
	}
}