package AlgorithmI;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {

    public boolean solution(String pattern, String s){
        String[] newarr = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        if(newarr.length != pattern.length()) return false;
        for(int i =0 ; i < pattern.length(); i++){
            if(map.containsValue(newarr[i]) && !map.containsKey(pattern.charAt(i))){
                return false;
            }else if (map.get(pattern.charAt(i)) == null){
                map.put(pattern.charAt(i), newarr[i]);
            }else if (!Objects.equals(map.get(pattern.charAt(i)), newarr[i])){
                return false;
            }
        }

        //   for(int i = 0; i< pattern.length(); i++){
        //    if(!newarr[i].equals(map.get(pattern.charAt(i))) ){
        //         return false;
        //    } 
        // }
        return true;
    }
    
}
