import java.util.*;

public class Main {

    static void printSubsets(int[] arr, ArrayList<Integer> ans, int i) {

        
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        
        ans.add(arr[i]);
        printSubsets(arr, ans, i + 1);

        // Backtrack
        ans.remove(ans.size() - 1);

        // Exclude
        printSubsets(arr, ans, i + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        ArrayList<Integer> ans = new ArrayList<>();

        printSubsets(arr, ans, 0);
    }
}