import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj11866 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}

		sb.append("<");

		while (!queue.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				queue.add(queue.poll());
			}
			sb.append(queue.poll());

			if (queue.size() == 0) {
				sb.append(">");
			}
			else {
				sb.append(", ");
			}
		}

		System.out.println(sb);
	}
}