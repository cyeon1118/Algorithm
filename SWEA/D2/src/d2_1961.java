import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d2_1961 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());

			int[][] arr0 = new int[N][N];

			for (int a = 0; a < N; a++) {
				st = new StringTokenizer(br.readLine());

				for (int b = 0; b < N; b++) {
					arr0[a][b] = Integer.parseInt(st.nextToken());
				}
			}

			int[][] arr90 = Rotation(arr0);
			int[][] arr180 = Rotation(arr90);
			int[][] arr270 = Rotation(arr180);

			sb.append("#").append(i + 1).append("\n");

			for (int l = 0; l < N; l++) {
				for (int m = 0; m < N; m++) {
					sb.append(arr90[l][m]);
				}

				sb.append(" ");

				for (int m = 0; m < N; m++) {
					sb.append(arr180[l][m]);
				}

				sb.append(" ");

				for (int m = 0; m < N; m++) {
					sb.append(arr270[l][m]);
				}

				sb.append("\n");
			}
		}

		System.out.println(sb);
	}

	static int[][] Rotation(int[][] arr) {
		int[][] result = new int[arr.length][arr.length];

		for (int j = 0; j < arr.length; j++) {
			for (int k = 0; k < arr.length; k++) {
				result[j][k] = arr[arr.length - 1 - k][j];
			}
		}

		return result;
	}
}