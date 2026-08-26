import java.util.*;

public class unorderedPair{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int D=sc.nextInt();
        int M=sc.nextInt();

        int[] arr=new int[N];

         for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<N;j++){

        //         if((arr[i]+arr[j]%D==0)&& (Math.floorMod(arr[i]-arr[j])%M==0)){
        //             count++;
        //         }
        //     }
        // }
        HashMap<String,Integer> map=new HashMap<>();
          for(int i=0;i<N;i++){
           

           int remM=((arr[i]%M)+M)%M;
           int remD=((arr[i]%D)+D)%D;

           int needD=(D-remD)%D;
           int needM=remM;

           String key=needM+","+needD;

           count+=map.getOrDefault(key,0);
           String currentKey=remM+","+remD;

           map.put(currentKey,map.getOrDefault(currentKey,0)+1);


        }
       System.out.println(count);
    }
}