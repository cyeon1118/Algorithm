import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int answer;
        int cnt = 0;

        for (int i = 0 ; i < N ; i++) {
            answer = Integer.parseInt(br.readLine());
            cnt += answer;
        }

        if ((N - cnt) > cnt) {
            System.out.println("Junhee is not cute!");
        }
        else {
            System.out.println("Junhee is cute!");
        }
    }
}