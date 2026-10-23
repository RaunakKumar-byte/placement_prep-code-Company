import java.util.*;

public class palin{

    public static boolean palin(long n){
        long rev=0;
        long temp=n;
        while(temp>0){
            int l_d=temp%10;
            temp=temp/10;
            rev=rev*10+l_d;
        }
        if(rev==n){
            return true;
        }
        return false;
    }

    public static int nextEl(int n){
        long x=(long)Math.floor(Math.sqrt(n))+1;
        while(true){
            long sq=x*x;
            if(sq>n && palin(sq)){
                return sq-n;
            }
            x++;

        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
    }
}