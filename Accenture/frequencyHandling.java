import java.util.*;

public class frequecyHandling{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        HashMap<Character, Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                int f=map.get(s.charAt(i));
                map.put(s.charAt(i),f+1);
            }else{
            map.put(s.charAt(i),1);
            }
            
        }

        int mod_sum=0;
        for(Character key: map.keySet()){
                    int sum=0;
                    int freq=map.get(key);

            sum=sum+((((int)key)*freq)%5);
            mod_sum=mod_sum+sum;

        }
    }
}