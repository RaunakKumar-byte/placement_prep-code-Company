import java.util.*;

public class blooms{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int orignalsum=0;
        int sum=0;
        boolean found=false;

         for(int i=0;i<n;i++){
                orignalsum+=arr[i];  
        }

      for(int i=0;i<n;i++){
                int before=0;
                int after=0;
                int same=0;

                for(int j=0;j<n;j++){
                    if(arr[i]==arr[j]){
                        same++;
                    }
                    if(j>i && arr[j]>arr[i]){
                        after++;
                    }
                    if(i>j && arr[i]>arr[j]){
                        before++;
                    }
                }
                if(before==after && same<=2){
                    sum+=arr[i];
                    found=true;
                }
        }
    }
}