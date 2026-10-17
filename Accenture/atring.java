import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            System.out.println(-1);
            return;
        }
        
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int maxVersion = -1;

        for (int i = 0; i < n; i++) {
            String s = arr[i];
            
            // Check if file starts with "File_"
            if (s != null && s.startsWith("File_")) {
                try {
                    // Extract version substring after "File_"
                    String vn = s.substring(5);
                    int version = Integer.parseInt(vn);
                    
                    if (version > maxVersion) {
                        maxVersion = version;
                    }
                } catch (NumberFormatException e) {
                    // Ignore invalid numbers after underscore
                }
            }
        }

        System.out.println(maxVersion);
    }
}