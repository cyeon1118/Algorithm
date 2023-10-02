import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class boj10816 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		HashMap<Integer, Integer> num = new HashMap<>();

		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int tempN = Integer.parseInt(st.nextToken());

			if (!num.containsKey(tempN)) {
				num.put(tempN, 1);
			}
			else {
				num.put(tempN, num.get(tempN) + 1);
			}
		}

		int M = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int tempM = Integer.parseInt(st.nextToken());

			if (!num.containsKey(tempM)) {
				sb.append(0).append(" ");
			}
			else {
				sb.append(num.get(tempM)).append(" ");
			}
		}

		System.out.println(sb);
	}
}