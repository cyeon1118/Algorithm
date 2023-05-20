import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d3_1206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());

			int[] tower = new int[N];

			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				tower[j] = Integer.parseInt(st.nextToken());
			}

			int result = 0;

			for (int k = 2; k < N - 2; k++) {
				int maxLeft = Math.max(tower[k - 1], tower[k - 2]);
				int maxRight = Math.max(tower[k + 1], tower[k + 2]);
				int max = Math.max(maxLeft, maxRight);

				if (tower[k] > max) {
					result += tower[k] - max;
				}
			}

			sb.append("#").append(i + 1).append(" ").append(result).append("\n");
		}

		System.out.println(sb);
	}
}