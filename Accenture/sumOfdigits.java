
import java.util.*;

public class sumOfdigits{

    public static int addDigit(int n){

        while(n>=10){
            int sum=0;
            while(n>0){
                int l_d=n%10;
                n=n/10;
                sum+=l_d;
            }
            n=sum;
        }
        return n;
    }

    public static void main(String[] args){
        Scanner  sc=new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println(addDigit(n));
    }
}