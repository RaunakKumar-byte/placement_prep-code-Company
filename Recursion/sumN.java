import java.util.*;

class sumN{

   public static int sumOfNnumber(int n) {
    if (n == 0) {
        return 0;
    }

    return n + sumOfNnumber(n - 1);
}
}