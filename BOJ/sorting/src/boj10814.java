import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Person> personList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            Person p = new Person(i, Integer.parseInt(st.nextToken()), st.nextToken());
            personList.add(p);
        }

        personList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() == o2.getAge()) {
                    return o1.getIndex() - o2.getIndex();
                }
                else {
                    return o1.getAge() - o2.getAge();
                }
            }
        });

        for (int j = 0; j < personList.size(); j++) {
            System.out.println(personList.get(j).getAge() + " " + personList.get(j).getName());
        }
    }

    static class Person {
        int index;
        int age;
        String name;

        public Person(int index, int age, String name) {
            this.index = index;
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public int getIndex() {
            return index;
        }
    }
}