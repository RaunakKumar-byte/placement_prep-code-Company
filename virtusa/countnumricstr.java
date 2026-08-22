import java.util.*;

public class countnumricstr{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        int i=0;
        int n=s.length();
        while(i<n){
            if(Character.isDigit(s.charAt(i))){
                int start=i;
                while((i<n && Character.isDigit(s.charAt(i)))){
                    i++;
                }
                int end=i-1;
                if(start>0 && end+1<n && Character.isLowerCase(s.charAt(start-1)) && Character.isLowerCase(s.charAt(end+1))){
                    count++;
                }
            }else{
                i++;
            }
        }
        System.out.println(count);
    }
}