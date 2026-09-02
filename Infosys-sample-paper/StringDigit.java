import java.util.*;

public class StringDigit{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        char digit=sc.next().charAt(0);

        int n=s.length();

      
        String max="";

          for(int i=0;i<n;i++){
            if(s.charAt(i)==digit){
                int index=i;

                String result=s.substring(0,index)+s.substring(index+1);
               
               if(result.compareTo(max)>0){
                max=result;
               }
            }
        }

         
        
    }
}