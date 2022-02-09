import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class boj11652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<Long, Integer> card = new HashMap<>();
        long key, maxKey = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            key = Long.parseLong(br.readLine());

            if (card.containsKey(key)) {
                card.put(key, card.get(key) + 1);
            }
            else {
                card.put(key, 1);
            }

            if (card.get(key) > max) {
                maxKey = key;
                max = card.get(key);
            }
            else if (card.get(key).equals(max)) {
                maxKey = Math.min(maxKey, key);
            }
        }
        System.out.println(maxKey);
    }
}