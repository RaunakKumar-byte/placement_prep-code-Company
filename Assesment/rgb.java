import java.util.*;


public class rgb{

    public static int count(char[] ch_arr, char ch){
        int count=0;

        for(int i=0;i<ch_arr.length;i++){
            if(ch_arr[i]==ch){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        char[] cha=new char[n];

          for (int i = 0; i < n; i++) {
            cha[i] = Character.toLowerCase(sc.next().charAt(0));
        }

        int c=0;

        for(int i=0;i<n;i++){
            int count_ch=count(cha,cha[i]);
            if(count_ch%2!=0){
                System.out.println(cha[i]);
                return;
            }
        }
        
            System.out.println("All are even");
    }
}