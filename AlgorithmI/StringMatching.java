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
}
