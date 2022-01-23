import java.util.Arrays;
import java.util.Scanner;

public class boj6996 {
    private static boolean solveAnagrams(String first, String second) {
        if (first.length() == second.length()) {
            String[] firstArr = new String[first.length()];
            String[] secondArr = new String[second.length()];

            for (int i = 0 ; i < firstArr.length ; i++) {
                firstArr[i] = String.valueOf(first.charAt(i));
                secondArr[i] = String.valueOf(second.charAt(i));
            }

            Arrays.sort(firstArr);
            Arrays.sort(secondArr);

            for (int j = 0 ; j < firstArr.length ; j++) {
                if (!firstArr[j].equals(secondArr[j])) {
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
