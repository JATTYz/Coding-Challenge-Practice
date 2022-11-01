package AlgorithmI;


public class sortByParity {
    
    public int[] Firsttry(int[] nums){
        
        int left = 0;
        int right = nums.length-1;

        while(left < right){

        if(nums[left] % 2 == 1){
            if(nums[right] % 2 == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }else{
                right--;
            }
        }else{
            left++;
        }
    }
    return nums;

}
}
