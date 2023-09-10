import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj2170 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		ArrayList<line> lines = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			lines.add(new line(x, y));
		}

		Collections.sort(lines, new Comparator<line>() {
			@Override
			public int compare(line o1, line o2) {
				if (o1.x == o2.x) {
					return o1.y - o2.y;
				}

				return o1.x - o2.x;
			}
		});

		int answer = lines.get(0).y - lines.get(0).x;
		int prev = lines.get(0).y;

		for (line l : lines) {
			if (prev >= l.y) {
				// 이전 줄이 현재 줄을 포함하면
				continue;
			}
			else if (prev > l.x) {
				//이전 줄의 끝이 현재 줄에 포함되어 있다면
				answer += l.y - prev;
				prev = l.y;
			}
			else {
				//이전 줄의 끝이 현재 줄보다 전에 있다면
				answer += l.y - l.x;
				prev = l.y;
			}
		}

		System.out.println(answer);
	}

	static class line {

		int x;
		int y;

		line(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}