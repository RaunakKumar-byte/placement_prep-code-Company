import java.util.*;

public class easy1{


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
       
       for(int i = 0; i < q; i++){
        int l = sc.nextInt();
    int r = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

        int k=0;
        for(int j=l;j<=r;j++){
                arr[j]=x+(k*y);
                k++;
        }


     }

            long MOD=1000000007;

            int sum=0;
            for(int i=0;i<n;i++){
                sum+=arr[i]%MOD;
            }

            System.out.println(sum);




    }
}