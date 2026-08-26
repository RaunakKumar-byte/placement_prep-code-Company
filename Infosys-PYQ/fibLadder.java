import java.util.*;

public class fibLadder{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        long A=sc.nextLong();
        long B=sc.nextLong();

        ArrayList<Integer> fib=new ArrayList<>();

        fib.add(1);
        fib.add(2);

        while(true){
            int next=fib.get(fib.size()-1)+fib.get(fib.size()-2);

            if(next>=N){
                break;
            }
            fib.add(next);
        }
        long[] dp=new long[N+1];

        Arrays.fill(dp, Long.MAX_VALUE);
        dp[1]=0;

        for(int i=2;i<=N;i++){

           for(int k:fib){

             if(k>i-1){
                break;
            }

            if(dp[i-k]!=LONG.MAX_VALUE){
                long jumpCost=A+B*K;
                    long totalCost = dp[i - k] + jumpCost;

                    dp[i] = Math.min(dp[i], totalCost);


            }
           }
        }
                System.out.println(dp[N]);

    }
}