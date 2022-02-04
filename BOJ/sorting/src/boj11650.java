import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Point> points = new ArrayList<>();
        Point p;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            p = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            points.add(p);
        }

        points.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.getX() == o2.getX()) {
                    return o1.getY() - o2.getY();
                }
                else {
                    return o1.getX() - o2.getX();
                }
            }
        });

        for (int j = 0; j < points.size(); j++) {
            System.out.println(points.get(j).getX() + " " + points.get(j).getY());
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}