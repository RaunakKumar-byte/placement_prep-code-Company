import java.util.*;

public class easy2{


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();


             long sum=0;
            long MOD=1000000007;


       
       for(int i = 0; i < q; i++){
        
     int  t= sc.nextInt();
     int l= sc.nextInt();
     int r = sc.nextInt();


     if(t==1){
             int val=arr[l];

        for(int j=l;j<=r;j++){
            arr[j]=(j-l+1)*val;
        }
     }
     if(t==2){
        for(int j=l;j<=r;j++){
            sum=(sum+arr[j])%MOD;
        }
     }

       


     }

          

System.out.println((int)sum);


    }
}