import java.util.*;

public class cake{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int cuts=1+((n*(n+1))/2);

        cuts=cuts%1000000007;

        System.out.println(cuts);
    }
}