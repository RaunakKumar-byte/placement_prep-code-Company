import java.util.*;

public class differanceReduction{

    public static int sumofLastDigit(int num){
        int sum=0;
        while(num>0){
            int l_d=num%10;
            num=num/10;
            sum+=l_d;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];

        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;

        for(int i=0;i<6;i+=2){
            sum+=Math.abs(arr[i]-arr[i+1]);
        }

       
        while(sum>9){
            sum=sumofLastDigit(sum);
        }
       
        System.out.println(sum);
       
    }
}