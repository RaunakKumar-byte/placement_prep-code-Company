import java.util.*;

public class twoSum{


    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int t=9;

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==t){
        //             return new int[]{i,j};
        //         }
        //     }
        // }

        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int need=t-nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i);
        }

       


    }
}