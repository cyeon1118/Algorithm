import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj15651 {

	static int N, M;
	static int[] num;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		num = new int[N + 1];
		int[] result = new int[M + 1];

		for (int i = 1; i <= N; i++) {
			num[i] = i;
		}

		dfs(result, 0, 1);

		System.out.println(sb);
	}

	static void dfs(int[] arr, int depth, int k) {
		if (depth == M) {
			for (int d = 1; d < arr.length; d++) {
				sb.append(arr[d]).append(" ");
			}
			sb.append("\n");

			return;
		}

		for (int d = 1; d <= N; d++) {
			arr[k] = num[d];
			dfs(arr, depth + 1, k + 1);
		}
	}
}