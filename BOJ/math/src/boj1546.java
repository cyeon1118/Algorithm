import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        double sum = 0.0;
        double avg;

        int N = Integer.parseInt(st.nextToken());
        double[] score = new double[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < N ; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }
        for(int j = 1 ; j < N ; j++){
            if(score[max] < score[j]){
                max = j;
            }
        }
        for(int k = 0 ; k < N ; k++){
            sum += score[k] / score[max] * 100;
        }
        avg = sum/N;
        System.out.println(avg);
    }
}
