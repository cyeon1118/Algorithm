import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int minB = 2001;
        int minD = 2001;
        int burger, drink;

        for (int i = 0; i < 3; i++) {
            burger = Integer.parseInt(br.readLine());
            if (minB > burger) {
                minB = burger;
            }
        }

        for (int j = 0; j < 2; j++) {
            drink = Integer.parseInt(br.readLine());
            if (minD > drink) {
                minD = drink;
            }
        }

        System.out.println(minB + minD - 50);
    }
}