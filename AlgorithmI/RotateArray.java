package AlgorithmI;

import java.util.Arrays;


public class RotateArray {

    public void rotate(int[] nums, int k){
        if(nums.length < 0){
            return;
        }

        int[] copy = Arrays.copyOf(nums, nums.length);

        int steps = k % nums.length;

        for(int i = 0; i < steps; i++){
            nums[i] = copy[nums.length - steps + i]; 
        }

        for(int i = steps; i < nums.length; i++){
            nums[i] = copy[i - steps];
        }
        
    }
}
