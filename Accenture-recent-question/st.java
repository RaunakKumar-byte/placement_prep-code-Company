import java,util.*;

public class st{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String words[]=s.trim().split(" ");
        Map<String, Integer> freq=new LinkedHashMap<>();

        for(String word: words){
            if(word.isEmpty()){
                continue;
            }
            String combo=""+word.charAt(0)+word.charAt(word.length()-1);
            freq.put(combo,freq.getOrDefault(combo,0)+1);
        }

        int max=0;
        for(int count: freq.values()){
            max=Math.max(count,max);
        }

        ArrayList<String> ans=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:freq.entrySet()){
            if(entry.getValue()==max){
                ans.add(entry.getKey());
            }
        }
    }
}