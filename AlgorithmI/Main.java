package AlgorithmI;

import java.util.Arrays;

import javax.naming.NameAlreadyBoundException;
import javax.sound.sampled.SourceDataLine;

public class Main {
   public static void main(String[] args) {
     int[] nums = {0,1,2,3,12};
     
     TwoSum test = new TwoSum();
     int[] answer = test.twoSum(nums, 4);
    
      // int[] answer = twoSum(nums, 12);
      // twoSum(nums, 4);
      System.out.println(Arrays.toString(answer));

   } 

   public static int[] twoSum(int[] numbers, int target){
        
      int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
  }

}
