import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d1_2068 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(st.nextToken());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());

			int max = -1;

			for (int j = 0; j < 10; j++) {
				int temp = Integer.parseInt(st.nextToken());

				if (max < temp) {
					max = temp;
				}
			}

			sb.append("#").append(i + 1).append(" ").append(max).append("\n");

		}

		System.out.println(sb);
	}
}