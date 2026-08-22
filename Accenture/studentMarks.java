import java.util.*;

public class studentMarks{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
                int sec_max=Integer.MIN_VALUE;

                for(int i=0;i<n;i++){
                    if(arr[i]>max){
                        sec_max=max;
                        max=arr[i];
                    }else if(arr[i]>sec_max){
                        sec_max=arr[i];
                    }
                }

                    int count1=0;
                    int count2=0;
                   for(int i=0;i<n;i++){
                   if(max==arr[i]){
                    count1++;
                   }else if(sec_max==arr[i]){
                    count2++;
                   }
                }

                if (sec_max == Integer.MIN_VALUE) {
            System.out.println(n - 1);
        }
        else {
            System.out.println((count1 - 1) + (count2 - 1));
        }

    }
}