package AlgorithmI;

import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    
    public List<String> solution(String[] words){

        List<String> l = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length - i; j++){

                if(words[i].equals(words[j]) == false && words[j].contains(words[i])){
                    l.add(words[i]);
                    break;
                }

            }
        }
        return l;
    }

    public static int[] bubbleSort(int[] arr){

        for(int i = 0; i< arr.length; i++){

            for(int j = 0;j < arr.length - i -1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }        
        return arr;
    }

}
