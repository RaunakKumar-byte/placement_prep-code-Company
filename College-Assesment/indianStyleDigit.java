import java.util.*;

public class indianStyleDigit{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        char ch=sc.next().charAt(0);

        String s=String.valueOf(num);
        if(s.length()<=3){
            System.out.println(s);
            return;
        }

        StringBuilder ans=new StringBuilder();

        int first=s.length()%2;
        if(first==0){
            first=1;
        }

        ans.append(s.substring(0,first));

        for(int i=first;i<s.length()-3;i+=2){
            ans.append(ch);
            ans.append(s.substring(i,i+2));
        }
        ans.append(ch);
        ans.append(s.substring(s.length()-3));
        System.out.println(ans);

    }
}