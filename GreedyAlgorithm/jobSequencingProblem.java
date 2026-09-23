import java.util.*;

public class jobSequencingProblem{


    public static void main(String[] args){
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

        int[][] result=new int[jobsInfo.length][3];
        for(int i=0;i<n;i++){
            result[i][0]=i;
            result[i][1]=jobsInfo[i][0];
            result[i][2]=jobsInfo[i][1];
        }

        Arrays.sort(result,Comparator.comparingDouble(o->o[2]).reverse());

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobsInfo.length;i++){
            int currentDeadline=result[i][1];
            if(currentDeadline>time){
                seq.add(result[i][0]);
                time++;

            }
        }
    }
}