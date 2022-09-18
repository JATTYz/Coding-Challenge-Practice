package AlgorithmI;

import java.util.Arrays;
import java.util.HashMap;

public class RelativeSort {
    
    public int[] solution(int[] arr1, int[] arr2){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: arr2){
            map.put(i, 0);
        }

        int[] arr = new int[arr1.length];
        int last = arr.length - 1;
        for(int i : arr1){
            if(map.containsKey(i)){
                map.put(i, map.getOrDefault(i,0) + 1);
            }else{
                arr[last--] = i;
            }
        }

        int pos = 0;
        for(int i: arr2){
            for(int j = 0; j< map.get(i);j++){
                arr[pos++] = i;

            }
        }
        Arrays.sort(arr);
        return arr;
    }
}
