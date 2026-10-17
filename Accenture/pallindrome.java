import java.util.*;

public class pallindrome{

    public static boolean isPallindrome(String s){
        int n=s.length();

        int l=0;
        int r=n-1;
        boolean isP=true;

        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                isP=false;
            }
            l++;
            r--;
        }`
        return isP;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        System.out.print(isPallindrome(s));


    }
}


import java.util.:
public class solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n sc.nextInt();
        int count=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}