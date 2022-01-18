import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class boj1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Long[] num = new Long[str.length()];

        for (int i = 0 ; i < str.length() ; i++) {
           num[i] =  Long.parseLong(String.valueOf(str.charAt(i)));
        }
        Arrays.sort(num, Collections.reverseOrder());

        for (int j = 0 ; j < num.length ; j++) {
            System.out.print(num[j]);
        }
    }
}
