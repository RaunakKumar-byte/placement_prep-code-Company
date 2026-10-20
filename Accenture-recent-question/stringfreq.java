import java.util.*;

public class stringfreq{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int sum=0;
    for(Character key:map.keySet()){
        int freqs=((  ((int)key) * map.get(key)) % 5);
        sum+=freqs;
    }
    System.out.println(sum);
    }
}