import java.util.*;

public class easy3{


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int k=sc.nextInt();


       int left=0;
       long sum=0;
       long maxsum=0;

       HashMap<Integer, Integer>map=new HashMap<>();
      
       for(int right=0;right<n;right++){
        
        sum+=arr[right];
        if(map.containsKey(arr[right])){
            map.put(arr[right],map.get(arr[right])+1);
        }else{
            map.put(arr[right],1);
        }
        while(map.size()>k){
             int val = arr[left];

                sum -= val;
                map.put(val, map.get(val) - 1);

                if (map.get(val) == 0) {
                    map.remove(val);
                }

                left++;
        }
        maxsum=Math.max(maxsum,sum);

       }

   


  System.out.println(Math.max(0,maxsum));

    }
}