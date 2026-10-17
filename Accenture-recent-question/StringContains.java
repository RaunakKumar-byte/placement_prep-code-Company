
import java.util.Scanner;

public class StringContains {

    public static boolean check(String s1, String s2) {
        String[] words = s1.split(" ");

        for (String word : words) {
            if (!s2.contains(word)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if (check(s1, s2)) {
            System.out.println(s1);
        } else if (check(s2, s1)) {
            System.out.println(s2);
        } else {
            System.out.println("NONE");
        }

        sc.close();
    }
}
