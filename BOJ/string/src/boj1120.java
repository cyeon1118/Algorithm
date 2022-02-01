import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();

        int lenSub = B.length() - A.length();
        int cnt = 0;

        if (lenSub != 0) {
            int[] sub = new int[lenSub + 1];
            int index;
            int min;

            for (int i = 0; i < lenSub + 1; i++) {
                cnt = 0;
                index = i;
                for (int j = 0; j < A.length(); j++) {
                    if (!String.valueOf(A.charAt(j)).equals(String.valueOf(B.charAt(index)))) {
                        cnt++;
                    }
                    index++;
                }
                sub[i] = cnt;
            }

            min = sub[0];
            for (int j = 1; j < sub.length; j++) {
                if (min > sub[j]) {
                    min = sub[j];
                }
            }

            System.out.println(min);
        }

        else {
            for (int k = 0; k < A.length(); k++) {
                if (!String.valueOf(A.charAt(k)).equals(String.valueOf(B.charAt(k)))) {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}