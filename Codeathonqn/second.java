import java.util.*;

public class second{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int best=0;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
              max=Math.max(max,arr[j]);
              min=Math.min(min,arr[j]);

              if(max-min<=k && j-i+1>best){
                best=j-i+1;
              }
            }
        }
        System.out.println(best);
    }
}