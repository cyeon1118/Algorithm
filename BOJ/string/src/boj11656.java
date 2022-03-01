import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj11656 {
    static String S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        ArrayList<String> list = new ArrayList<>();

        S = br.readLine();

        for (int i = 0; i < S.length(); i++) {
            list.add(suffix(i));
        }

        Collections.sort(list);

        for (int j = 0; j < list.size(); j++) {
            sb.append(list.get(j)).append("\n");
        }

        System.out.println(sb);
    }

    static String suffix(int start) {
        return S.substring(start);
    }
}