public class MinimumBase{

    public static void main(String[] args){
        int n=sc.nextInt();
        int b=sc.nextInt();

        int temp=n;
        int newBaseDigit=0;
                String ans = "";


        while(temp>0){
            int last_d=temp%b;
            ans=last_d+ans;
            temp=temp/b;

        }


    }
}