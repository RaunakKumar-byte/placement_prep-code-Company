import java.util.*;

public class First{

    public static void main(String[] args){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int s=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //longest subarray continbous that staisfu 2 condition
    // 1st> max - min <=k
    // 2nd> sum<=5

    int best=0;
    int st=0;
    int end=0;
    for(int i=0;i<n;i++){
        int sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int j=i;j<n;j++){
            sum+=arr[j];
            min=Math.min(min,arr[j]);
            max=Math.max(max,arr[j]);

            if(max-min<=k && sum<=s && j-i+1>best){
                best=j-i+1;
                start=i;
                end=j;
            }
        }
    }
    System.out.println(best+" "+start+" "+end);

    }
}