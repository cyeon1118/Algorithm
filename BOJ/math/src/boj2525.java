import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int temp = Integer.parseInt(br.readLine());

        int sum = minute + temp;

        if (sum >= 60) {
            minute = sum % 60;
            hour += sum / 60;
        }
        else {
            minute = sum;
        }

        if (hour >= 24) {
            hour -= 24;
        }

        System.out.println(hour + " " + minute);
    }
}