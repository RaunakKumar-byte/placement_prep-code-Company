import java.util.*;

public class KaprekarNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

 int square = n * n;
        int temp = square;

        int digits = 0;
        while(temp > 0) {
            digits++;
            temp = temp / 10;
        }
        int divisor = (int)Math.pow(10, digits / 2);
        int right = square % divisor;
        int left = square / divisor;

       if(right+left==n){
        System.out.println("Kaprekar Number");
       }else{
        System.out.println("Not kaprkar Number");
       }
    }
}