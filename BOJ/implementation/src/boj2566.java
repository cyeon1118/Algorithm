import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int max = Integer.MIN_VALUE;
		int temp;
		int x = 1;
		int y = 1;

		for (int i = 1; i < 10; i++) {
			st = new StringTokenizer(br.readLine());

			for (int j = 1; j < 10; j++) {
				temp = Integer.parseInt(st.nextToken());

				if (max < temp) {
					max = temp;
					x = i;
					y = j;
				}
			}
		}

		System.out.println(max);
		System.out.println(x + " " + y);
	}
}