import java.util.*;

public class validComposition{
    static int count=0;
    static int n,a,b,c;

    static void solve(int sum, int last){
        if(sum==n){
            count++;
            return;
        }
        if(sum>n){
            return;
        }
        if(last!=a){
            solve(sum+a,a);
        }

        if(last!=b){
            solve(sum+b,b);

        }
        if(last!=c){
            solve(sum+c,c);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();



    }
}