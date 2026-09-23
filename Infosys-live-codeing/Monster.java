import java.util.*;

public class Monster{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();

        int[][] Monsters=new int[n][2];

        for(int i=0;i<n;i++){
            Monsters[i][0]=power[i];
            Monsters[i][1]=bonus[i];
        }
    }
}