public class fib{

    public static int Normalfibonnaci(int n){
        if(n==0 || n==1){
            return n;
        }

        return Normalfibonnaci(n-1)+Normalfibonnaci(n-2);
    }


    public static int MemoizationFib(int n, int dpFib[]){
        if(n==0 || n==1){
            return n;
        }
        if(dpFib[n]!=0){
            return dpFib[n];
        }
        dpFib[n]=MemoizationFib(n-1,dpFib)+MemoizationFib(n-2,dpFib);

        return dpFib[n];
    }

    public static int tabulationFib(int n, int[] tabulationFib){

         if (n == 0 || n == 1) {
            return n;
        }
        tabulationFib[0]=0;
        tabulationFib[1]=1;
        for(int i=2;i<=n;i++){
            tabulationFib[i]=tabulationFib[i-1]+tabulationFib[i-2];
        }

        return tabulationFib[n];
    }

    public static void main(String[] args){
        int n=5;

        int[] dpFib=new int[n+1];

                int[] tabulationFib=new int[n+1];

 System.out.println("Normal: "
                + Normalfibonnaci(n));

        System.out.println("Memoization: "
                + MemoizationFib(n, dpFib));

        System.out.println("Tabulation: "
                + tabulationFib(n, tabulationFib));
    }
}