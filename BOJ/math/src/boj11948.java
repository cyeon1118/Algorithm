import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11948 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = 0;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < 4; i++) {
			int temp = Integer.parseInt(br.readLine());

			sum += temp;

			min = Math.min(temp, min);
		}

		sum -= min;

		min = Integer.MAX_VALUE;

		for (int i = 0; i < 2; i++) {
			int temp = Integer.parseInt(br.readLine());

			sum += temp;

			min = Math.min(temp, min);
		}

		sum -= min;

		System.out.println(sum);
	}
}