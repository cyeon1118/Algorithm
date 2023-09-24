import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2748 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine().trim());

		long[] arr = new long[(int) (n + 1)];

		arr[0] = 0;

		if (n > 0) {
			arr[1] = 1;

			for (int i = 2; i <= n; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}

		System.out.println(arr[(int) n]);
	}
}