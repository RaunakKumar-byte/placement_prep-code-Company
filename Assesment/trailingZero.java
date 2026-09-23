import java.util.*;

public class trailingZero{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        in n=sc.nextInt();

        int count=0;
        while(n>=5){
            n=n/5;
            count+=n;
        }
    }
}