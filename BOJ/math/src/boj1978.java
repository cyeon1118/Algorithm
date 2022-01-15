import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int flag = 0;
        int num;
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            num = Integer.parseInt(st.nextToken());
            int cnt = 0;

            if(num != 1){
                cnt += 1;
                for(int j = 2 ; j < num+1 ; j++){
                    if(num % j == 0){
                        cnt += 1;
                    }
                }
            }
            if(cnt == 2){
                flag += 1;
            }
        }

        System.out.println(flag);
    }
}
