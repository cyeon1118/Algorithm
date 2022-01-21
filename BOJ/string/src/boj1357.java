import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1357 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        System.out.println(Rex(Rex(X) + Rex(Y)));
    }
    public static int Rex(int num){
        String str = String.valueOf(num);
        int[] reArr = new int[str.length()];

        int n = 0;
        for (int i = str.length()-1 ; i >= 0 ; i--) {
            reArr[n++] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        int len = reArr.length;
        for (int j = 0 ; j < reArr.length ; j++) {
            for (int k = 0 ; k < len-1 ; k++) {
                reArr[j] *= 10;
            }
            len--;
        }

        int result = 0;
        for (int l = 0 ; l < reArr.length ; l++) {
            result += reArr[l];
        }

        return result;
    }
}