import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();
        int[] num = new int[M];
        int cntSum = 0;
        int target, cntFront, cntRear;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 1; j <= N; j++) {
            deque.offer(j);
        }

        for (int k = 0; k < num.length; k++) {
            cntFront = 0;
            target = num[k];

            while (true) {
                if (deque.peekFirst() != null) {
                    if (deque.peekFirst() != target) {
                        deque.offerLast(deque.pollFirst());
                        cntFront++;
                    }
                    else {
                        break;
                    }
                }
                else {
                    break;
                }
            }

            cntRear = deque.size() - cntFront;

            if (cntFront <= cntRear) {
                deque.pollFirst();
                cntSum += cntFront;
            }
            else {
                for (int m = 0; m < cntFront + cntRear; m++) {
                    deque.offerFirst(deque.pollLast());
                }
                deque.pollFirst();
                cntSum += cntRear;
            }
        }

        System.out.println(cntSum);
    }
}