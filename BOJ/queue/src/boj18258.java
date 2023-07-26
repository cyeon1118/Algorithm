import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj18258 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		LinkedList<Integer> queue = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {

			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			switch (str) {
				case "push":
					queue.add(Integer.parseInt(st.nextToken()));
					break;

				case "pop":
					if (queue.isEmpty()) {
						sb.append(-1).append("\n");
					}
					else {
						int n = queue.get(0);
						queue.remove(0);
						sb.append(n).append("\n");
					}
					break;

				case "size":
					sb.append(queue.size()).append("\n");
					break;

				case "empty":
					if (queue.isEmpty()) {
						sb.append(1).append("\n");
					}
					else {
						sb.append(0).append("\n");
					}
					break;

				case "front":
					if (queue.isEmpty()) {
						sb.append(-1).append("\n");
					}
					else {
						sb.append(queue.get(0)).append("\n");
					}
					break;

				case "back":
					if (queue.isEmpty()) {
						sb.append(-1).append("\n");
					}
					else {
						sb.append(queue.get(queue.size() - 1)).append("\n");
					}
					break;
			}
		}

		System.out.println(sb);
	}

}