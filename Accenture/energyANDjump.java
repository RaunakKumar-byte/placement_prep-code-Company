import java.util.*;


public class energyANDjump{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int T=sc.nextInt();

        int[] E=new int[N];
        int[] J=new int[N-1];

        for(int i=0;i<N;i++){
            E[i]=sc.nextInt();
        }

         for(int i=0;i<N-1;i++){
            J[i]=sc.nextInt();
        }
    }
}