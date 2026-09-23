import java.util.*;

public class MonsterDefeat{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int Intialp=sc.nextInt();

          int[] RP=new int[n];
                int[] BP=new int[n];
        for(int i=0;i<n;i++){
            RP[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            BP[i]=sc.nextInt();
        }

        int[][] res=new int[n][3];

        for(int i=0;i<n;i++){
            res[i][0]=i;
            res[i][1]=RP[i];
            res[i][2]=BP[i];
        }

        Arrays.sort(res, Comparator.comparingDouble((o->o[1])));

        int startingP=Intialp;
        int count=0;
        for(int i=0;i<n;i++){
            if(startingP>=res[i][1]){
                startingP+=res[i][2];
                count++;
            }
        }
        System.out.println("No of monster to defeat "+count);
    }
}