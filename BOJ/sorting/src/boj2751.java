import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> num = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(num);

        for (int j = 0; j < num.size(); j++) {
            sb.append(num.get(j)).append("\n");
        }

        System.out.println(sb);
    }
}