import java.util.ArrayList;
import java.util.Collections;

public class boj4673 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> arr = new ArrayList<>();

        int num = 1;

        do {
            arr.add(d(num++));
        } while (num <= 10000);

        Collections.sort(arr);

        for (int i = 1; i < 10001; i++) {
            if(!arr.contains(i)){
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    static int d(int n) {
        String str = String.valueOf(n);
        int result = n;

        for (int j = 0; j < str.length(); j++) {
            result += Integer.parseInt(String.valueOf(str.charAt(j)));
        }

        return result;
    }
}