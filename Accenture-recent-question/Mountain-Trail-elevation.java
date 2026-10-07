import java.util.*;

public class Mountian{

    public static int Maximum_possible_Sum(int[] arr){
        int n=arr.length;

        if(n<3){
            return 0;
        }

        int[] leftSum=new int[n];
        int[] leftLen=new int[n];

        int[] rightSum=new int[n];
        int[] rightLen=new int[n];

        leftSum[0]=arr[0];
        leftLen[0]=1;

        for(int i=1;i<n;i++){
            if(arr[i-1]<arr[i]){
                leftSum[i]=leftSum[i-1]+arr[i];
                leftLen[i]=leftLen[i-1]+1;
            }else{
                leftSum[i]=arr[i];
                leftLen[i]=1;
            }
        }


        rightSum[0]=arr[0];
        rightLen[0]=1;

        for(int i=n-2;i>=0;i--){
            if(arr[i+1]<arr[i]){
                rightSum[i]=rightSum[i+1]+arr[i];
                rightLen[i]=rightLen[i+1]+1;
            }else{
                rightSum[i]=arr[i];
                rightLen[i]=1;
            }
        }

        int maxsum=0;

        for(int i=1;i<n-1;i++){
            if(leftLen[i]>1 && rightLen[i]>1){
                int currentsum=leftSum[i]+rightSum[i]-arr[i];
                maxsum=Math.max(maxsum, currentsum);
            }
        }
        return maxsum;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


    }
}