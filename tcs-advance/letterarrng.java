public class letterarrng{


    public static void main(String[] args){
        String str="bcdiou";

        StringBuilder vow=new StringBuilder();
                StringBuilder cons=new StringBuilder();


        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='o'||ch=='u'||ch=='i'){
                vow.append(ch);
            }else{
                cons.append(ch);
            }
        }
                StringBuilder res=new StringBuilder();
                int iv=0;
                int cv=0;
                   for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(i%2==0){
                res.append(vow.charAt(iv));
                iv++;
            }else{
                res.append(cons.charAt(cv));
                cv++;
            }
        }
        System.out.println(res.toString());

    }
}