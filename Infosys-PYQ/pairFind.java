import java.util.*;

public class pairFind{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int T=sc.nextInt();
        int[] arr=new int[n];

         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int countPairs=0;
       
      boolean[] used=new boolean[n];
      for(int i=0;i<n;i++){
        if(used[i]){
            continue;
        }
        for(int j=i+1;j<n;j++){
            if(!used[j] &&(arr[i]+arr[j])%T==0){
                countPairs++;
                used[i]=true;
                used[j]=true;
                break;
            }
        }
      }
        System.out.println(countPairs);
    }
}