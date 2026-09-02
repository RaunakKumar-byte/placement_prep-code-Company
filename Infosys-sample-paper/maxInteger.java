import java.util.*;

public class maxInteger{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n+1];

        arr[0]=0;
        arr[1]=1;

        for(int i=1;i<n+1;i++){
            int d=2*i+1;
            int e=2*i;
           if(e<=n){
            arr[e]=arr[i];
           }
           if(d<=n){
            arr[d]=arr[i]+arr[i+1];
           }
        }
     int max = 0;

        for (int i = 0; i <= n; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
        
    }
}