import java.util.*;

public class knapsack{

    public static int knapsackRecursive(int val[], int wt[], int w,int n){
        if(w==0 || n==0){
            return 0;
        }

        if(wt[n-1]<=w){//valid

            //include
           int ans= val[n-1]+knapsackRecursive(val, wt, w-wt[n-1],n-1)
           //exclude
           int ans2=knapsackRecursive(val,wt,w,n-1);

           return Math.max(ans,ans2);
        }else{//invalid
           return knapsack(val,wt,w,n-1);
        }
    }


    public static void main(String[] args){
        int val[]={15,14,10,45,30};
    int wt[]={2,5,1,3,4};
    int w=7;
    }
}