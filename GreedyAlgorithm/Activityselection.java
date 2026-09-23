import java.util.*;


public class Activityselection{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int st[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //sorting
        int[][] Activity=new int[st.length][3];

        for(int i=0;i<st.length;i++){
            Activity[i][0]=i;
            Activity[i][1]=start[i];
            Activity[i][2]=end[i];
        }

            Arrays.sort(Activies,Comparator.comparingDouble(0->o[2]));
        //end time sorted
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        //1st activity
        maxAct=1;
        ans.add(Activity[0][0]);

        int lastEnd=Activity[0][2];

        for(int i=1;i<end.length;i++){
                if(Activity[i][1]>=lastEnd){
                    //activity selct
                    maxAct++;
                    ans.add(Activity[i][0]);
                    lastEnd=Activity[i][2];
                }
        }

        System.out.println("max activities = "+ maxAct);

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}