import java.util.*;

public class BalancedStringPartitions{

    public static void main(String[] args){

        String str="LRRRRLLRLLRL";
        int Lcount=0;
        int Rcount=0;

        int MaxX=0;

        for(int i=0;i<str.length;i++){
            char ch=str.charAt(i);

            if(ch=='L'){
                Lcount++;
            }else if(ch=='R'){
                Rcount++;
            }

            if(Lcount==Rcount){
                MaxX++;
            }
        }
    }
}