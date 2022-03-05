import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj10866 {
    static Deque<Integer> deque;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push_front":
                    push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
    }

    static void push_front(int X) {
        deque.offerFirst(X);
    }

    static void push_back(int X) {
        deque.offerLast(X);
    }

    static int pop_front() {
        int front = -1;
        if (!deque.isEmpty()) {
            front = deque.pollFirst();
        }

        return front;
    }

    static int pop_back() {
        int back = -1;
        if (!deque.isEmpty()) {
            back = deque.pollLast();
        }

        return back;
    }

    static int size() {
        return deque.size();
    }

    static int empty() {
        if (deque.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    static int front() {
        int front = -1;
        if (!deque.isEmpty()) {
            front = deque.peekFirst();
        }

        return front;
    }

    static int back() {
        int back = -1;
        if (!deque.isEmpty()) {
            back = deque.peekLast();
        }

        return back;
    }
}