import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int start = 0;
        int maxLength = 0;
        int bestStart = 0;

        for (int end = 0; end < s.length(); end++) {

            for (int j = start; j < end; j++) {

                if (s.charAt(j) == s.charAt(end)) {
                    start = j + 1;
                    break;
                }
            }

            int currentLength = end - start + 1;

            if (currentLength > maxLength) {
                maxLength = currentLength;
                bestStart = start;
            }
        }

        String longest =
                s.substring(bestStart, bestStart + maxLength);

        System.out.println("Length of longest substring: " + maxLength);
        System.out.println("Longest substring: " + longest);

        sc.close();
    }
}
