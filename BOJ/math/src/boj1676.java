import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class boj1676 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		BigInteger mul = BigInteger.ONE;

		for (int i = 1; i <= N; i++) {
			mul = mul.multiply(BigInteger.valueOf(i));
		}

		String s = String.valueOf(mul);

		int index = 0;
		for (int i = s.length() - 1; i > 0; i--) {
			if (s.charAt(i) != '0') {
				index = s.length() - 1 - i;
				break;
			}
		}

		System.out.println(index);
	}
}