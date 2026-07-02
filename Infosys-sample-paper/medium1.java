import java.util.*;
public class medium1{


    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    int[] A=new int[N];
    int[] B=new int[N];
    for(int i=0;i<N;i++){
        A[i]=sc.nextInt();

    }
     for(int i=0;i<N;i++){
        B[i]=sc.nextInt();
        
    }
    int Max_sum=Integer.MIN_VALUE;
    int sum=0;
    for(int i=0;i<N;i++){
        
        int sum1=0;
        sum1=sum1-B[i];

        x=x-1;
        y=y-1;
        int sum2=A[i]*x*y*z;

         y=y-1;
         z=z-1;
        int sum3=A[i]*x*y*z;

        sum=sum+Math.max(sum1,Math.max(sum2, sum3));
    }



    }
}