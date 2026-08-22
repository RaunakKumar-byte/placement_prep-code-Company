import java.util.*;

public class bloomFlower {

    public static boolean CheakBoom1stcondition(int[] arr, int el) {

        int sm_el = 0;
        int gr_el = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > el) {
                gr_el++;
            } 
            else if (arr[i] < el) {
                sm_el++;
            }
        }

        return gr_el == sm_el;
    }

    public static int getFreq(int arr[], int el) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == el) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (CheakBoom1stcondition(arr, arr[i])) {

                int freqel = getFreq(arr, arr[i]);

                if (freqel <= 2) {
                    sum += arr[i];
                }
            }
        }

        System.out.println(sum);
    }
}