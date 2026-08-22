import java.util.*;


public class toy{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] cost=new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }

        Arrays.sort(cost);



        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum=sum+cost[i];
            if(sum<=k){
                count++;
            }else if(sum>k){
                sum=sum-cost[i];
                break;
            }
        }
        System.out.println(count);

    }
}