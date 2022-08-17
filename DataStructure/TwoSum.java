package DataStructure;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){

        int start = 0;
        int length = nums.length;

        while(start < length){

            for(int i = start+1; i < length; i++){
                if(nums[start] + nums[i] == target){
                    return new int[]{start, i};
                }
            }
            start++;
        }
       return new int[]{0,0}; 
    }    
}
