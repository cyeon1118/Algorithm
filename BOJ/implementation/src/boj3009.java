import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        ArrayList<Integer> pointX = new ArrayList<>();
        ArrayList<Integer> pointY = new ArrayList<>();

        int x, y;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());

            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            if (pointX.contains(x)) {
                pointX.remove(pointX.indexOf(x));
            }
            else {
                pointX.add(x);
            }

            if (pointY.contains(y)) {
                pointY.remove(pointY.indexOf(y));
            }
            else {
                pointY.add(y);
            }
        }

        System.out.println(pointX.get(0) + " " + pointY.get(0));
    }
}