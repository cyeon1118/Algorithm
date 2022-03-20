import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class boj2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        class Balloon {
            final int index;
            final int num;

            public Balloon(int index, int num) {
                this.index = index;
                this.num = num;
            }
        }

        Deque<Balloon> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            deque.offer(new Balloon(i + 1, Integer.parseInt(st.nextToken())));
        }

        while (!deque.isEmpty()) {
            int num = deque.peekFirst().num;
            sb.append(deque.pollFirst().index).append(" ");

            if (deque.isEmpty()) {
                break;
            }

            if (num < 0) {
                for (int j = 0; j < Math.abs(num); j++) {
                    deque.offerFirst(deque.pollLast());
                }
            }
            else {
                for (int k = 0; k < Math.abs(num) - 1; k++) {
                    deque.offerLast(deque.pollFirst());
                }
            }
        }

        System.out.println(sb);
    }
}