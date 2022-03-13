import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj10845 {
    static Deque<Integer> queue;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
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

    static void push(int X) {
        queue.offerLast(X);
    }

    static int pop() {
        if (!queue.isEmpty()) {
            return queue.pop();
        }
        else {
            return -1;
        }
    }

    static int size() {
        return queue.size();
    }

    static int empty() {
        if (queue.isEmpty()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    static int front() {
        if (!queue.isEmpty()) {
            return queue.peekFirst();
        }
        else {
            return -1;
        }
    }

    static int back() {
        if (!queue.isEmpty()) {
            return queue.peekLast();
        }
        else {
            return -1;
        }
    }
}