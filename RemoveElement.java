import java.util.ArrayList;
import java.util.List;

class RemoveElement{
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
       System.out.println(removeElement(nums, val));
       System.out.println(removeEl(nums, val)); 
    }


    public static int removeElement(int[] nums, int val){
        
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(val != nums[i]){
                arr.add(nums[i]);
            }
        }
        System.out.println(arr);
        
        return arr.size();
    }

    public static int removeEl(int[] nums, int val){
        int start = 0;
        int i = 0;
        while(i < nums.length){
            if(nums[i] == val)i++;
            else {
                nums[start] = nums[i];
                start++;
                i++;
            }
        }
        System.out.println(nums.toString());
        return start;
    }
}