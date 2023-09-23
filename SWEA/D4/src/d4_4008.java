import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class d4_4008 {

	static int N, min, max;
	static int[] operatorCnt;
	static int[] operator;
	static int[] num;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine().trim());

		for (int t = 0; t < T; t++) {
			N = Integer.parseInt(br.readLine().trim());

			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;

			num = new int[N];
			operatorCnt = new int[4];
			operator = new int[N - 1];
			visited = new boolean[N - 1];
			int[] result = new int[N - 1];

			st = new StringTokenizer(br.readLine().trim());

			for (int i = 0; i < 4; i++) {
				operatorCnt[i] = Integer.parseInt(st.nextToken());
			}

			int index = 0;

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < operatorCnt[i]; j++) {
					operator[index++] = i;
				}

			}

			st = new StringTokenizer(br.readLine().trim());

			for (int i = 0; i < N; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(operator);

			dfs(result, 0);

			sb.append("#").append(t + 1).append(" ").append(max - min).append("\n");

		}

		System.out.println(sb);
	}

	static void dfs(int[] result, int depth) {
		if (depth == N - 1) {
			int answer = num[0];

			for (int d = 1; d < N; d++) {
				if (result[d - 1] == 0) {
					answer += num[d];
				} else if (result[d - 1] == 1) {
					answer -= num[d];
				} else if (result[d - 1] == 2) {
					answer *= num[d];
				} else if (result[d - 1] == 3){
					answer /= num[d];
				}
			}

			min = Math.min(answer, min);
			max = Math.max(answer, max);

			return;
		}

		int before = -1;

		for (int d = 0; d < operator.length; d++) {
			if (operator[d] != before) {
				if (!visited[d]) {
					visited[d] = true;
					result[depth] = operator[d];
					before = operator[d];
					dfs(result, depth + 1);
					visited[d] = false;
				}
			}
		}
	}
}