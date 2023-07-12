import java.io.*;
import java.util.StringTokenizer;

public class d1_1936 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		if (A == 1) {
			if (B == 2) {
				System.out.println("B");
			}
			else {
				System.out.println("A");
			}
		}
		else if (A == 2) {
			if (B == 1) {
				System.out.println("B");
			}
			else {
				System.out.println("A");
			}
		}
		else {
			if (B == 1) {
				System.out.println("B");
			}
			else {
				System.out.println("A");
			}
		}
	}
}