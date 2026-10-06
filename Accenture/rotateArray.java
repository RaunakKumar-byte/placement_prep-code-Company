import java.util.*;

public class rotateArray{

    public static void reverseArray(int[] arr,int st, int end){

        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

reverseArray(arr,0,n-1);
reverseArray(arr,k,n-1);
reverseArray(arr,0,k-1);
         for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}