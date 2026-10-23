
public class num{

    public static int digit(int num){
        
        while(num>=10){
            int  sum=0;
            while(num>0){
                int l_d=num%10;
                sum+=l_d;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
}