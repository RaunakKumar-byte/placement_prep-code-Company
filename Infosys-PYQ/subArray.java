import java.util.*;


public class subArray{

    public static int countFreq(int el,int st,int end,int[] arr){
        int count=0;
        for(int i=st;i<=end;i++){
            if(arr[st]==el){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int[][] cost=new int[n][n];

        for(int i=0;i<n;i++){
            HashMap<Integer, Integer> freq=new HashMap<>();
            int maxFreq=0;

            for(int j=i;j<n;j++){
                freq.put(a[j],freq.getOrDefault(a[j],0)+1);
                maxFreq=Math.max(maxFreq,freq.get(a[j]));

                cost[i][j]=maxFreq;
            }
        }

    }
}