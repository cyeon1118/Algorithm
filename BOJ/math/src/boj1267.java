import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1267 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine().trim());

		int[] cost = new int[N];

		st = new StringTokenizer(br.readLine().trim());

		for (int i = 0; i < N; i++) {
			cost[i] = Integer.parseInt(st.nextToken());
		}

		int yTotal = 0;
		int mTotal = 0;

		for (int i = 0; i < N; i++) {
			yTotal += ((cost[i] / 30) + 1) * 10;
			mTotal += ((cost[i] / 60) + 1) * 15;
		}

		if (yTotal < mTotal) {
			sb.append("Y").append(" ").append(yTotal);
		}
		else if (yTotal > mTotal) {
			sb.append("M").append(" ").append(mTotal);
		}
		else {
			sb.append("Y").append(" ").append("M").append(" ").append(yTotal);
		}

		System.out.println(sb);
	}
}