import java.util.*;


public class discount{



    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while(T-->0){

            int N = sc.nextInt();   

            int[] P = new int[N];   // original prices
            int[] D = new int[N];   // discounted prices


            // Taking original prices
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }


            // Taking discounted prices
            for (int i = 0; i < N; i++) {
                D[i] = sc.nextInt();
            }


            // Printing to check input
            System.out.println("Original Prices:");
            for (int x : P) {
                System.out.print(x + " ");
            }

            System.out.println();

            System.out.println("Discount Prices:");
            for (int x : D) {
                System.out.print(x + " ");
            }

            System.out.println("\n");
        }

        }
    }
