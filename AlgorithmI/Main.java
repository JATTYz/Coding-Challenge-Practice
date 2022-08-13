package AlgorithmI;

import java.util.Arrays;

import javax.naming.NameAlreadyBoundException;

public class Main {
   public static void main(String[] args) {
     int[] nums = {0,1,0,3,12};
      
    MoveZone test = new MoveZone();
    test.moveZeros(nums); 
      System.out.println(Arrays.toString(nums));

   } 

}
