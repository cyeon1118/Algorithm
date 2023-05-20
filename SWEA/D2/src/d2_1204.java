import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d2_1204 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(st.nextToken());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());

			int num = Integer.parseInt(st.nextToken());

			int[] cnt = new int[1001];

			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 1000; j++) {
				int temp = Integer.parseInt(st.nextToken());
				cnt[temp] += 1;
			}

			int max = 1;

			for (int k = 2; k <= 1000; k++) {
				if (cnt[max] <= cnt[k]) {
					max = k;
				}
			}

			sb.append("#").append(num).append(" ").append(max).append("\n");
		}

		System.out.println(sb);
	}
}