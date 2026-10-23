import java.util.*;

public class asciical{

    public static int calculatAscii(String s){
        int n=s.length();
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        int sum=0;
        for(Character ch:freq.keySet()){
            int p=(((int)ch)*map.get(ch))%5;
            sum+=p;
        }
        return sum;
    }
}