import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1759 {

	static int L, C;
	static int vowel;
	static int consonant;
	static String[] alphabet;
	static boolean[] visited;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();

		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		alphabet = new String[C];
		visited = new boolean[C];
		String[] result = new String[L];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < C; i++) {
			alphabet[i] = st.nextToken();
		}

		Arrays.sort(alphabet);

		dfs(result, 0, 0);

		System.out.println(sb);
	}

	static void dfs(String[] result, int depth, int start) {
		if (depth == L) {
			String str = "";

			for (String s : result) {
				if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
					vowel++;
				}
				else {
					consonant++;
				}

				str += s;
			}

			if (vowel >= 1 && consonant >= 2) {
				sb.append(str).append("\n");
			}

			vowel = 0;
			consonant = 0;

			return;
		}

		for (int d = start; d < C; d++) {
			if (!visited[d]) {
				visited[d] = true;
				result[depth] = alphabet[d];
				dfs(result, depth + 1, d);
				visited[d] = false;
			}
		}
	}
}