import java.util.*;

public class totalNumberOfrows{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int n=(int)Math.sqrt(l);

        int i=0;
        char[][] matrix=new char[n][n];
        for(int j=0;j<n;j++){
            for(int k=0;k<n;k++){
                matrix[j][k]=s.charAt(i);
                i++;
            }
        }

    int count=0;

        
        for(int j=0;j<n;j++){
            boolean tr=true;
            for(int k=1;k<n;k++){
               if(matrix[j][k-1]!=matrix[j][k]){
                tr=false;
                break;
               }
            }
            if(tr){
                count++;
            }
        }

         for(int j=0;j<n;j++){
            boolean tc=true;
            for(int k=1;k<n;k++){
               if(matrix[k-1][j]!=matrix[k][j]){
                tc=false;
                break;
               }
            }
            if(tc){
                count++;
            }
        }
System.out.println(count);
    }
}