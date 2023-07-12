import java.io.*;

public class d1_2058 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int sum = 0;

		while (N != 0) {
			sum += N % 10;
			N /= 10;
		}

		System.out.print(sum);
	}
}