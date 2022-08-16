package DataStructure;

import java.util.Arrays;
import java.util.HashMap;

public class ContainDuplicate {
    
        public boolean containDuplicate(int[] nums){
            
            int start = 0;
            int length = nums.length;

            while(start < length){

                for(int i = start+1; i< length;i++){
                    if(nums[start] == nums[i]){
                        return true;
                    }
                }
                start++;
            }

            return false;
        }

        public boolean bestSolution(int[] nums){

            HashMap<Integer, Integer> hash = new HashMap<>();

            for(int i =0; i <nums.length; i++){
                hash.put(nums[i], hash.getOrDefault(nums[i], 0)+1);
                if(hash.get(nums[i]) == 2){
                    return true;
                }
            }
            return false;
           
        }

        public boolean newOne(int[] nums){
            Arrays.sort(nums);
            for(int i =0;i< nums.length; i++){
                for(int j = i+1; j <= nums.length - i; j++){
                        System.out.println(nums[i]);
                        System.out.println(nums[j]);
                    if(nums[i] == nums[j]){
                        return true;
                    }
                }
            }
            return false;
        }

}
