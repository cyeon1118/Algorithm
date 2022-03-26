import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class boj16466 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            priorityQueue.offer(Integer.parseInt(st.nextToken()));
        }

        int check = 1;
        while (!priorityQueue.isEmpty()) {
            if (priorityQueue.poll() == check) {
                check++;
            }
            else {
                break;
            }
        }

        System.out.println(check);
    }
}