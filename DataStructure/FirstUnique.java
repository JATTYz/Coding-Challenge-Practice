package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class FirstUnique {
    public int solution(String s){
        
        if(s.length() == 0){
            return -1;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
            System.out.println(map);
        }

        for(char c: s.toCharArray()){
            if(map.get(c) == 1){
                System.out.println(map);
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
