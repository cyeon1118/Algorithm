import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj5800 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int classNum = Integer.parseInt(br.readLine());

        int[][] result = new int[classNum][3];

        for(int n = 0 ; n < classNum ; n++){
            st = new StringTokenizer(br.readLine());
            int studentNum = Integer.parseInt(st. nextToken());

            Integer[] score = new Integer[studentNum];
            for(int i = 0 ; i < studentNum ; i++){
                score[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(score, Collections.reverseOrder());

            int gap;
            int max = 0;
            for(int j = 0 ; j < studentNum-1 ; j++){
                gap = score[j] - score[j+1];
                if(max < gap){
                    max = gap;
                }
            }
            result[n][0] = score[0];
            result[n][1] = score[studentNum-1];
            result[n][2] = max;
        }

        for (int k = 0 ; k < classNum ; k++){
            System.out.println("Class " + (k+1));
            System.out.println("Max " + result[k][0] + ", Min " + result[k][1] + ", Largest gap " + result[k][2]);
        }
    }
}
