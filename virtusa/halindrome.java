import java.util.*;

public class halindrome {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }


    public static boolean isHalindrome(String s) {

        // Condition 1
        if (s.length() < 2) {
            return false;
        }

        // Condition 2
        if (isPalindrome(s)) {
            return true;
        }


        // Divide into two equal parts
        int mid = s.length() / 2;

        String s1 = s.substring(0, mid);
        String s2 = s.substring(s.length() - mid);


        // Condition 3
        return isHalindrome(s1) || isHalindrome(s2);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int count = 0;

        for (int i = 0; i < n; i++) {

            String s = sc.nextLine();

            if (isHalindrome(s)) {
                count++;
            }
        }

        System.out.println(count);
    }
}