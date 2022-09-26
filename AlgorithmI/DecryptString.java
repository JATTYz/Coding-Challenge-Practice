package AlgorithmI;

import java.util.HashMap;

public class DecryptString {
    

   public String solution(String s){

    HashMap<String, Character> map = new HashMap<>();
     
    for(int i = 1; i < 10 ; i++){
        map.put(String.valueOf(i), (char)(i + 96));
    }

    for(int i = 0; i < 17; i++){
        map.put(String.valueOf(10+i) + "#", (char)(i + 106));
    }

    StringBuilder answer = new StringBuilder();

    int i = 0;
    while(i < s.length()){

        if(s.charAt(i) != '#' && i + 2 < s.length()){
            if(s.charAt(i+2) == '#'){
            answer.append(map.get(String.valueOf(s.charAt(i))+ 
                                    String.valueOf(s.charAt(i+1))+ 
                                    String.valueOf('#')));
            i+=3;
            }else{
            answer.append(map.get(String.valueOf(s.charAt(i))));
            i++;
            }
        }else{
            
            answer.append(map.get(String.valueOf(s.charAt(i))));
            i++;
        }

       
    }

    return answer.toString(); 
   } 

}
