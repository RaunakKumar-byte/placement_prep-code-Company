public class climbing_Stairs{

        public static int NormalRecursion(int n){
            if(n==0){
                return 1;
            }
            if(n<0){
                return 0;
            }
            return NormalRecursion(n-1)+NormalRecursion(n-2);
        }


         public static int MemoCountingways(int n, int[] F){
            if(n==0){
                return 1;
            }
            if(n<0){
                return 0;
            }
            if(F[n]!=0){
                return F[n];
            }
            F[n]=MemoCountingways(n-1,F)+MemoCountingways(n-2,F);



            return F[n];
        }

          public static int TabulationCountingways(int n, int[] F){
            if(n==0){
                return 1;
            }
            if(n<0){
                return 0;
            }
            F[0]=1;
            for(int i=1;i<=n;i++){
                if(i==1){
                    F[i]=F[0]+0;
                }else{
                    F[i]=F[i-1]+F[i-2];
                }
            }



            return F[n];
        }
    public static void main(String[] args){

        int n=10;

        int[] MemoDp=new int[n+1];
                int[] TabulationDp=new int[n+1];

    }
}