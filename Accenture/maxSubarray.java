public class maxSubarray{

    public static int maxLengthSubarray(int[] nums){
        int len=1;
        int maxLen=1;

        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                
                    len++;
                
            }else{
                len=1;
            }
            maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}