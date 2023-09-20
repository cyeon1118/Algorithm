import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class boj1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine().trim().toUpperCase(Locale.ROOT);

		int[] alphabet = new int[26];

		for (int i = 0; i < str.length(); i++) {
			alphabet[str.charAt(i) - 'A']++;
		}

		int cnt = 0;
		int max = -1;
		int maxIndex = -1;

		for (int i = 0; i < alphabet.length; i++) {
			if (max < alphabet[i]) {
				cnt = 0;
				max = alphabet[i];
				maxIndex = i;
			}
			if (max == alphabet[i]) {
				cnt++;
			}
		}

		if (cnt > 1) {
			sb.append("?");
		}
		else {
			sb.append((char) (maxIndex + 65));
		}

		System.out.println(sb);
	}
}