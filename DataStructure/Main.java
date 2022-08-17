package DataStructure;

import java.util.Arrays;

public class Main {
   
    public static void main(String[] args) {

        int[] nums = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

      MergeSortedArray test = new MergeSortedArray();
      
    test.merge(nums, 3, nums2, 3); 
    }
}
