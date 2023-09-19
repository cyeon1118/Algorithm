import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5565 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int totalPrice = Integer.parseInt(br.readLine().trim());
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			sum += Integer.parseInt(br.readLine().trim());
		}

		System.out.println(totalPrice - sum);
	}
}