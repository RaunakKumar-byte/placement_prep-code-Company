import java.util.*;

public class StringMatrix{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        String s=str.replace(" ","");
        int l=s.length();

        double k=Math.sqrt(l);

        int row=(int)Math.floor(k);
        int col=(int)Math.ceil(k);

        char matrix[][]=new char[row][col];
        int index=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=s.charAt(index);
                index++;
            }
        }
        String res="";

         for(int i=0;i<col;i++){
            for(int j=0;j<row;j++){
                res+=matrix[j][i];
                
            }
            res+=" ";
        }


        System.out.println(res);
        

    }
}