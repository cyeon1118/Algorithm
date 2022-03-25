import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class boj1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        class Doc {
            final int index;
            final int n;

            public Doc(int index, int n) {
                this.index = index;
                this.n = n;
            }
        }

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<Doc> queue = new LinkedList<>();

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < N; j++) {
                queue.offer(new Doc(j, Integer.parseInt(st.nextToken())));
            }

            int cnt = 0;
            while (!queue.isEmpty()) {
                Doc max = queue.pollFirst();
                boolean flag = true;

                for (int k = 0; k < queue.size(); k++) {
                    if (max.n < queue.get(k).n) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    cnt++;
                    if (max.index == M) {
                        break;
                    }
                }
                else {
                    queue.offerLast(max);
                }
            }

            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}