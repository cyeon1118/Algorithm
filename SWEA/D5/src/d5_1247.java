import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class d5_1247 {

	static Point company, home;
	static int min;

	static ArrayList<Point> r;
	static ArrayList<Point> customer;
	static ArrayList<ArrayList<Point>> route;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());

			st = new StringTokenizer(br.readLine());

			company = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			home = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

			r = new ArrayList<>();
			customer = new ArrayList<>();
			route = new ArrayList<>();
			visited = new boolean[N];

			for (int i = 0; i < N; i++) {
				customer.add(
					new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			}

			min = Integer.MAX_VALUE;

			findRoute(r, 0, N);

			sb.append("#").append(t + 1).append(" ").append(min).append("\n");
		}

		System.out.println(sb);
	}

	static void findRoute(ArrayList<Point> r, int depth, int n) {
		if (depth == n) {
			int result = findMinRoute(r);

			min = Math.min(min, result);

			return;
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				r.add(customer.get(i));
				findRoute(r, depth + 1, n);
				visited[i] = false;
				r.remove(customer.get(i));
			}
		}

	}

	static int findMinRoute(ArrayList<Point> arrList) {
		int sum = 0;

		sum += Math.abs(company.x - arrList.get(0).x) + Math.abs(company.y - arrList.get(0).y);

		for (int j = 0; j < arrList.size() - 1; j++) {
			sum += Math.abs(arrList.get(j).x - arrList.get(j + 1).x) + Math.abs(
				arrList.get(j).y - arrList.get(j + 1).y);
		}

		sum += Math.abs(arrList.get(arrList.size() - 1).x - home.x) + Math.abs(arrList.get(arrList.size() - 1).y - home.y);

		return sum;
	}

	static class Point {

		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}