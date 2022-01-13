import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] num = new int[N];
        int temp;
        ArrayList <Integer> sum = new ArrayList<>();
        int max = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        for (int j = 0; j < N-2 ; j++) {
            for(int k = j+1 ; k < N-1 ; k++){
                for(int l = k+1 ; l < N ; l++){
                    temp = num[j] + num[k] + num[l];
                    if(temp < M){
                        sum.add(temp);
                    }
                    else if(temp == M){
                        sum.add(temp);
                        break;
                    }
                }
            }
        }

        for (int m = 1; m < sum.size(); m++) {
            if(sum.get(max) < sum.get(m)){
                max = m;
            }
        }

        System.out.println(sum.get(max));
    }
}
