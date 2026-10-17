import java.util.*;

public class runingSum{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int rs=0;
        int count=0;

        for(int i=1;i<=n;i++){
            rs+=i;
            if(rs%5==0){
                count++;
            }
        }
    }
}