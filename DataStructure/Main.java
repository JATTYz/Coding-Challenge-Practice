package DataStructure;

import javax.sound.sampled.SourceDataLine;

public class Main {
   
    public static void main(String[] args) {

        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        MaximumSubarray test = new MaximumSubarray();

        System.out.println(test.maxSubArray(nums));
    }
}
