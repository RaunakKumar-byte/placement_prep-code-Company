import java.util.*;

public class findseq{

//you should select a maximum length fair seq you task is to print maximum sum with maximum length
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0;
        int max_len=0;

        int left=0;
        int sum=0;
        for(int right=0;right<n;right++){
          int sum=sum+arr[right];
          max=Math.max(sum,max);
          max_len=Math.max(max_len,right-left+1);
          if(max<sum){
            sum=sum-arr[l];
            l++;
          }
        }

       
    }
}