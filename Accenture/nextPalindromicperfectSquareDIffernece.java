import java.util.*;


public class nextPalindromicperfectSquareDIffernece{


            public static boolean pallindrome(int n){
                int temp=n;
                int rd=0;
                while(temp!=0){
                    int l_d=temp%10;
                    temp=temp/10;
                    rd=rd*10+l_d;
                }
                if(n==rd){
                    return true;
                }
                return false;
            }

            public static int findNextPlaaindromediff(int n){
                int k=(int)Math.floor(Math.sqrt(n))+1;

                while(true){
                    int square=k*k;
                    if(square>N && Palindrome(square)){
                        return square-n;
                    }
                    k++;
                }
            }
         public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            System.out.println(findNextPlaaindromediff(n));

        }
}