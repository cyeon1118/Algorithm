import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d2_1859 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(st.nextToken());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int[] num = new int[N];

			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				num[j] = Integer.parseInt(st.nextToken());
			}

			int max = N - 1;
			long result = 0;

			for (int k = N - 2; k >= 0; k--) {
				if (num[max] > num[k]) {
					result += num[max] - num[k];
				}
				else if (num[max] < num[k]) {
					max = k;
				}
			}

			sb.append("#").append(i + 1).append(" ").append(result).append("\n");
		}

		System.out.println(sb);
	}
}