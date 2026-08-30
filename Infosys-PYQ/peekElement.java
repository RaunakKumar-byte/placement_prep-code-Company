import java.util.*;

public class peekElement{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int cost=0;
                int[] first=new int[n/2];
        int[] second=new int[n/2];


        int mid=n/2;
          for(int i=0;i<n/2;i++){
            first[i]=arr[i];
            second[i]=arr[mid+i];
        }
    Arrays.sort(first);
    Arrays.sort(second);

    for(int i=0;i<n/2;i++){
        cost+=Math.abs(first[i]-second[i]);
    }
    }
}