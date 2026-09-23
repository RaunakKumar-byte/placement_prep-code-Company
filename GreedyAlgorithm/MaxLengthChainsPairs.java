import java.util.*;


public class MaxLengthChainsPairs{


        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();
            int[][] pairs=new int[n][2];

            for(int i=0;i<n;i++){
                for(int j=0;j<2;j++){
                    pairs[i][j]=sc.nextInt();
                }
            }
     int[][] result=new int[n][3];

     for(int i=0;i<n;i++){
        result[i][0]=i;
        result[i][1]=pairs[i][0];
        result[i][2]=pairs[i][1];
     }

     Arrays.sort(result, Comparator.comparingDouble(o->o[2]));

     ArrayList<Integer> ans=new ArrayList<>();
     int count=0;

     count=1;
     ans.add(result[0][0]);

     int endP=result[0][2];

     for(int i=1;i<n;i++){
        if(result[i][1]>=endP){
            count++;
            ans.add(result[i][0]);
            endP=result[i][2];
        }
     }

            System.out.println("max activities = "+ count);

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        }
}