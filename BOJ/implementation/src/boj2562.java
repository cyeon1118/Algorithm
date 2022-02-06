import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int max;
        int maxIndex = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
                maxIndex = j + 1;
            }
        }

        System.out.println(max);
        System.out.println(maxIndex);
    }
}