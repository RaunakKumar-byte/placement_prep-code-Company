import java.util.*;

public class containsDuplicate{


    public static void main(String[] args){
        int[] nums={1,2,3,4};

        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
    }
}