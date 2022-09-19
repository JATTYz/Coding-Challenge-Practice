package AlgorithmI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import AlgorithmI.SlidingWindow.Permutation;


public class Main {
   public static void main(String[] args) {

      HashMap<Integer, Integer> arr = new HashMap<>();
      HashSet<Integer> a = new HashSet<>();
      Set<Integer> b = new TreeSet<>();


      int[] test = {1,1,12,3,4,5,4,4,6};

      for(int i =0; i< test.length; i++){
         arr.put(test[i], arr.getOrDefault(test[i],0)+1);
         a.add(test[i]);
         b.add(test[i]);
      }

      System.out.println(arr);
      System.out.println(b);

   }

}
