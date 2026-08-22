import java.util.*;

public class calculated {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();
        int day = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

        map.put("sun", 0);
        map.put("mon", 1);
        map.put("tue", 2);
        map.put("wed", 3);
        map.put("thu", 4);
        map.put("fri", 5);
        map.put("sat", 6);

        int start = map.get(str);

        int firstSun = (7 - start) % 7;

        int ans;

        if (firstSun >= day) {
            ans = 0;
        } else {
            ans = 1 + (day - firstSun - 1) / 7;
        }

        System.out.println(ans);
    }
}