public class armstrong{

    public static boolean findarms(int n){
        int sum=0;
        int count_d=0;
        int temp=n;
        int temp2=n;
           if (n == 0) {
        count_d = 1;
           } else {
        while (temp != 0) {
            temp = temp / 10;
            count_d++;
        }
    }

         while(temp2!=0){
            int last_d=temp2%10;
            temp2=temp2/10;
            sum=sum+(int)Math.pow(last_d, count_d);
        }
         
          if (n == 0) {
        sum = 0;
    }
        if(n==sum){
            return true;
        }

        return false;
    } 


    public static void main(String[] args){
    

    for(int i=0;i<99999;i++){
        if(findarms(i)){
            System.out.println(i);
        }
    }
    }
}