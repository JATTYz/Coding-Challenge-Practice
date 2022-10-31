package AlgorithmI;

import java.util.Arrays;

public class sortByParity {
    
    public int[] Firsttry(int[] nums){
       
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){

            if(nums[i+1] % 2 == 0){
                int temp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = temp;
            }
            
            if(i == nums.length - 2){
                int temp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = temp;
                break;
            }

        }

        return nums;

    }

}
