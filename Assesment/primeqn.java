import java.util.*;


class primeqn{
    
    public static boolean isprime(int x){
       if(x<=1){
        return false;
       }

       for(int i=2;i*i<=x;i++){
        if(x%i==0){
            return false;
        }
       }
       return true;
    }
    
    
    public static int cheaksum(int x){
        int count =0;
        
        
        for(int i=2;i<x+1;i++){
            if(isprime(i)){
            int sum=0;

            for(int j=2;j<x+1;j++){
                if(isprime(j)){
                    sum=sum+j;
                    if(sum==i){
                        count++;
                    }
                }
            
        }
            }
        }
        return count;
    }
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=cheaksum(n);
        System.out.println(ans-1);
        
    }
}
