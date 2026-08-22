import java.util.*;

public class stringfreqcounter {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

 HashMap<Character, Integer> map = new HashMap<>();

     for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
         if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

char ans = str.charAt(0);
int minfreq = Integer.MAX_VALUE;

    
    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(map.get(ch)<minfreq){
            minfreq=map.get(ch);
            ans=ch;
        }
    }

    System.out.println("Character: " + ans);
        System.out.println("Frequency: " +minfreq);
    }
}