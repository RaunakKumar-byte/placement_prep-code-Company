import java.util.*;

public class Third{
    static int[] a;
    static int k;
    static ArrayList<Integer> list=new ArrayList<>();

    static void backtrack(int st){
        if(list.size()==k){
            System.out.println(list);
            return;
        }

        for(int i=st;i<a.length;i++){
            list.add(a[i]);
            backtrack(i+1);
            list.remove(list.size()-1);

        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
         k=sc.nextInt();

        a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        backtrack(0);
    }
}