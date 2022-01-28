import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class boj7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayList<Person> table = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            table.add(new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 1));
        }

        for (int j = 0; j < N; j++) {
            for (int k = 0; k < N; k++) {
                if (table.get(j).kg < table.get(k).kg) {
                    if (table.get(j).cm < table.get(k).cm) {
                        table.get(j).ranking++;
                    }
                }
            }
            sb.append(table.get(j).ranking).append(" ");
        }

        System.out.println(sb);
    }

    public static class Person {
        int kg;
        int cm;
        int ranking;

        public Person(int kg, int cm, int ranking) {
            this.kg = kg;
            this.cm = cm;
            this.ranking = ranking;
        }
    }
}