import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class boj2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        sb.append(average(num)).append("\n");
        sb.append(middle(num)).append("\n");
        sb.append(mode(num)).append("\n");
        sb.append(range(num));

        System.out.println(sb);
    }

    static int average(int[] arr) {
        int sum = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }

        return (int) Math.round((double) sum / arr.length);
    }

    static int middle(int[] arr) {
        return arr[arr.length / 2];
    }

    static int mode(int[] arr) {
        int[] check = new int[8001];
        ArrayList<Integer> maxNum = new ArrayList<>();
        int max;

        Arrays.fill(check, 0);

        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < 0) {
                check[Math.abs(arr[k]) + 4000]++;
            }
            else {
                check[arr[k]]++;
            }
        }

        max = 0;
        for (int l = 0; l < check.length; l++) {
            if (max < check[l]) {
                maxNum = new ArrayList<>();

                if (l > 4000) {
                    maxNum.add((l - 4000) * (-1));
                }
                else {
                    maxNum.add(l);
                }

                max = check[l];
            }
            else if (max == check[l]) {
                if (l > 4000) {
                    maxNum.add((l - 4000) * (-1));
                }
                else {
                    maxNum.add(l);
                }
            }
        }

        if (maxNum.size() > 1) {
            Collections.sort(maxNum);

            return maxNum.get(1);
        }
        else {
            return maxNum.get(0);
        }
    }

    static int range(int[] arr) {
        return arr[arr.length - 1] - arr[0];
    }
}