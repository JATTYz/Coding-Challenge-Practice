package AlgorithmI;

public class sortByParity {
    
    public int[] Firsttry(int[] nums){
        int s = 0;
        int end = nums.length-1;

        while(s < end){

            if(nums[s] % 2 != 0){
                int temp = nums[s];
                nums[s] = nums[end];
                nums[end] = temp;
            }

            s++;
            end--;
        }

        return nums;
    }

}
