import java.util.*;

public class indianCoin{

    public static void main(String[] args){
        int amount=121;

        int[] coins={1,2,5,10,20,50,100,500,2000};

        Arrays.sort(coins, Comparator.reverse());

        int count=0;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=v){
                while(coins[i]<=v){
                    amount-=coins[i];
                    count++;
                    ans.add(coins[i]);
                }
            }
        }
    }
}