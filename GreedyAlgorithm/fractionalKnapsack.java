import java.util.*;

public class fractionalKnapsack{

    public static void main(String[] args){
        int[] wt={10,20,30};
        int[] vl={60,100,120};

        int w=50;

        double[][] ratio=new double[wt.length][2];
        for(int i=0;i<wt.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=vl[i]/(double)wt[i];
        }

        Arrays.sort(ratio, Comparator.comparingDuble(o->o[1]).reversed());
        ArrayList<Integer> ans=new ArrayList<Integer>;
        int value=0;
                int capacity=w;


        for(int i=0;i<ratio.length;i++){
            int idx=(int)ratio[i][0];
            if(capacity>=wt[idx]){
                capacity=capacity-wt[idx];
                value=value+vl[idx];
            }else{
                value=value+(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }

        System.outntln(value);
    }
}