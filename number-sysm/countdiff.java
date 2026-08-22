import java.util.*;

public class countdiff{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int diff=arr[i]-arr[j];
        //        if(diff==k || diff==-k){
        //         count++;
        //        }
        //     }
        // }

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }

         for(int i=0;i<n;i++){
            if(set.contains(arr[i]+k)){
                count++;
            }
        }
             System.out.println(count);
       
    }
}