import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5586 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArr = new String[str.length()];
        int joiCnt = 0;
        int ioiCnt = 0;

        for (int i = 0 ; i < str.length() ; i++) {
            strArr[i] = String.valueOf(str.charAt(i));
        }

        for (int j = 0 ; j < strArr.length - 2 ; j++) {
            if (strArr[j].equals("J")) {
                if (strArr[j+1].equals("O")) {
                    if (strArr[j+2].equals("I")) {
                        joiCnt++;
                    }
                }
            }
            else if (strArr[j].equals("I")) {
                if (strArr[j+1].equals("O")) {
                    if (strArr[j+2].equals("I")) {
                        ioiCnt++;
                    }
                }
            }
        }

        System.out.println(joiCnt);
        System.out.println(ioiCnt);
    }
}