package AlgorithmI;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
     int[] nums = {1,2,3,4,5,6,7};
     RotateArray test = new RotateArray();
      test.rotate(nums, 3);
     for(int i : nums){
        System.out.print(i);
     } 

   } 

}
