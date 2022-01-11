import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] score = new int[5];
        int max = 0;

        for(int i = 0 ; i < 5 ; i++){
            int sum = 0;
            st = new StringTokenizer(br.readLine());

            for(int j = 0 ; j < 4 ; j++){
                int input = Integer.parseInt(st.nextToken());
                sum += input;
            }
            score[i] = sum;
        }

        for(int k = 1 ; k < 5 ; k++){
            if(score[max] < score[k]){
                max = k;
            }
        }

        System.out.println((max + 1) + " " + score[max]);
    }
}
