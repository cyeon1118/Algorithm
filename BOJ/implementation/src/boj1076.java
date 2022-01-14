import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj1076 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        String[] table = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int f = Arrays.asList(table).indexOf(first);
        int s = Arrays.asList(table).indexOf(second);
        long t = Arrays.asList(table).indexOf(third);

        long result = (long) ((f * 10 + s) * (Math.pow(10, t)));

        System.out.println(result);
    }
}
