package DataStructure;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m ,int[] nums2, int n){
        
       for(int i=m;i<nums1.length;i++){
        nums1[i]=nums2[i-m];
    }

       for(int i : nums1){
           System.out.println(i);
       }
    //   Arrays.sort(nums1); 
      
    }
    
}
