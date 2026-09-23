import java.util.*;

public class BestTimeToBuyandSell{

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        int[] prices={7,1,5,3,6,4};
        int maxprofit=0;

        // for(int i=0;i<prices.length;i++){

        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[i]<prices[j]){
        //             profit=Math.max(profit,prices[j]-prices[i]);
        //         }

        //     }
        // }

            int minPrice=prices[0];
          for(int i=0;i<prices.length;i++){
                if(minPrice>prices[i]){
                    minPrice=prices[i];
                }
                int cp=prices[i]-minPrice;
                if(cp>0 && cp>maxprofit){
                    maxprofit=cp;
                }
          
        }

    }
}