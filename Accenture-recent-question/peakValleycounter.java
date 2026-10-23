import java.util.*;

public class peakValleycounter{

    public static int countPeakandValley(int[] arr){
        int n=arr.length;
        int peak=0;
        int valley=0;

        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                peak++;
            }
            if(arr[i]<arr[i-1] && arr[i]<arr[i+1]){
                valley++;
            }
        }
        int product=peak*valley;
        if(product>9){
            return product%7;
        }
        return product;
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