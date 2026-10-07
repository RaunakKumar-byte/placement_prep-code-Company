

public class ArrayDigitallengthAndDigitOprn{

    public static int Adddigit(int n){
        int sum=0;
        n=Math.abs(n);
        while(n>0){
            int l_d=n%10;
            n=n/10;
            sum=sum+l_d;
        }
        return sum;
    }


    public static void main(String[] args){
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;

        for(int i=0;i<n;i++){
            int len=String.valueOf(Math.abs(arr[i])).length();

            if(len%2==0){
                sum=sum+(len*len);
            }else{
                sum=sum+Adddigit(arr[i]);
            }

        }
        
    }
}