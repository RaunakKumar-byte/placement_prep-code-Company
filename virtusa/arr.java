import java.util.*;
public class arr{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] sort=new int[n];

         for(int i=0;i<n;i++){
            sort[i]=arr[i];
        }
        Arrays.sort(sort);
        int count=0;
         for(int i=0;i<n;i++){
            if(sort[i]==arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}