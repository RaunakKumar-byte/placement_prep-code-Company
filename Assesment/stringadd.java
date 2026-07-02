import java.util.*;



class solution{
    public static boolean cheakvowel(char ch){
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=sc.nextLine();
        
        
        StringBuilder result=new StringBuilder();

        
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            if(cheakvowel(ch)){
                ch='%';
            }
            
            result.append(ch);
        }
        
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            if(cheakvowel(ch)==false){
                ch='#';
            }
            
            result.append(ch);
        }
        str3.toUpperCase();
         for(int i=0;i<str3.length();i++){
            char ch=str3.charAt(i);
            
            result.append(ch);
        }
        System.out.println(result.toString());
        
    }
}
