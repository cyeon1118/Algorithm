import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class d3_1240 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		String[] num = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011", "0110111", "0001011"};

		for (int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			String[] code = new String[56];
			int[] result = new int[9];

			String line = "";
			int one = -1;
			boolean flag = false;

			for (int i = 0; i < N; i++) {
				if (flag) {
					br.readLine();
				} else {
					line = String.valueOf(br.readLine());
					for (int j = M - 1; j > code.length; j--) {
						if (String.valueOf(line.charAt(j) - '0').equals("1")) {
							one = j;
							flag = true;
							break;
						}
					}
				}
			}

			for (int k = 55; k >= 0; k--) {
				code[k] = String.valueOf(line.charAt(one--) - '0');
			}

			int index = 0;
			int cnt = 1;

			while (index < 56) {
				String s = "";

				for (int j = 0; j < 7; j++) {
					s += code[index++];

				}

				for (int j = 0; j < 10; j++) {
					if (s.equals(num[j])) {
						result[cnt] = j;
						cnt++;
					}
				}
			}

			int sum = (result[1] + result[3] + result[5] + result[7]) * 3 + (result[2] + result[4]
				+ result[6] + result[8]);

			if (sum % 10 == 0) {
				sum = 0;

				for (int i = 1; i < result.length; i++) {
					sum += result[i];
				}

				sb.append("#").append(t + 1).append(" ").append(sum).append("\n");
			} else {
				sb.append("#").append(t + 1).append(" ").append(0).append("\n");
			}
		}

		System.out.println(sb);
	}
}