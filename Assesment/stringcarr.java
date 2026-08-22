import java.util.*;

public class stringcarr{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        int[] freqc=new int[26];

        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            freq[ch-'a']++;
        }

        int minfreq=Integer.MAX_VALUE;
        char minch=str.charAt(0);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(minfreq<freq[ch-'a']){
                minfreq=freq[ch-'a'];
                ch=minch;
            }
        }
    }
}