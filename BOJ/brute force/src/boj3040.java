import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class boj3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> num = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            num.add(Integer.parseInt(br.readLine()));
            sum += num.get(i);
        }

        for (int j = 0; j < num.size() - 1; j++) {
            for (int k = j + 1; k < num.size(); k++) {
                if ((sum - (num.get(j) + num.get(k))) == 100) {
                    num.remove(j);
                    num.remove(k - 1);
                    break;
                }
            }
        }

        for (int l = 0; l < num.size(); l++) {
            System.out.println(num.get(l));
        }
    }
}