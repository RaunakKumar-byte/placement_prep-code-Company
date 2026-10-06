
import java.util.*;

public class SquareLastDigitMatch{

    public static int countLastDigit(int n, int d){
        int count=0;
        for(int i=1;i<=n;i++){
            long sq=(long)i*i;
            int last_d=(int)sq%10;
            if(last_d==d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
    }
}