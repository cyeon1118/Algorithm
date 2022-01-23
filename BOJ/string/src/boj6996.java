import java.util.Arrays;
import java.util.Scanner;

public class boj6996 {
    private static boolean solveAnagrams(String first, String second) {
        if (first.length() == second.length()) {
            String[] str1Arr = new String[first.length()];
            String[] str2Arr = new String[second.length()];

            for (int j = 0 ; j < str1Arr.length ; j++) {
                str1Arr[j] = String.valueOf(first.charAt(j));
                str2Arr[j] = String.valueOf(second.charAt(j));
            }
            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);

            for (int l = 0 ; l < str1Arr.length ; l++) {
                if (!str1Arr[l].equals(str2Arr[l])) {
                    return false;
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
