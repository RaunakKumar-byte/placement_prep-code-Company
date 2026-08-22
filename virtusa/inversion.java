import java.util.*;

public class inversion{

    public int[] findPermutation(int n,int k){
        int max=n*(n-1)/2;

        if(k<0 || k>max){
            return new int[]{-1};
        }

        int[] ans=new int[n];
        int left=1;
        int right=n;
        int index=0;






return new int[]{-1};
    }

    public static int countInversions(int[] arr){
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={6,3,5,2,7};

        int n=sc.nextInt();
        int k=sc.nextInt();
       System.out.println(countInversions(arr));
    }
}