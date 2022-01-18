import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj17608 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] stick = new int[N];
        int cnt = 1;
        int max = 0;

        for (int i = 0 ; i < N ; i++) {
            stick[i] = Integer.parseInt(br.readLine());
        }

        for (int j = N-1 ; j >= 0 ; j--) {
            if(stick[N-1] < stick[j]) {
                if (max < stick[j]){
                    cnt++;
                    max = stick[j];
                }
            }
        }

        System.out.println(cnt);
    }
}