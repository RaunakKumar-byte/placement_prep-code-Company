import java.util.*;

public class smithno {

    public static int sumofdigit(int n) {
        int sum = 0;
        while (n != 0) {
            int ld = n % 10;
            n = n / 10;
            sum += ld;
        }
        return sum;
    }

    public static boolean checkprime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int originalSum = sumofdigit(n);
        int factorSum = 0;
        int temp = n;
        
        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0 && checkprime(i)) {
                factorSum += sumofdigit(i);
                temp /= i;
            }
        }

        if (factorSum == originalSum)
            System.out.println("True (Smith Number)");
        else
            System.out.println("False (Not a Smith Number)");
    }
}