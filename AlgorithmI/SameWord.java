package AlgorithmI;

import java.util.HashMap;

public class SameWord {
    
    public static void main(String[] args) {
       
       System.out.println(solution("fxaav","afxav"));
    }

    public static boolean solution(String a, String b){

        HashMap<Character, Integer> word1 = new HashMap<>();
        HashMap<Character, Integer> word2 = new HashMap<>();

        for(int i = 0 ; i < a.length(); i++){
            if(word1.containsKey(a.charAt(i))){
                word1.put(a.charAt(i), 1 + word1.get(a.charAt(i)));
            }else{
                word1.put(a.charAt(i), 1);
            }
        }

        for(int i = 0; i< b.length(); i++){
            if(word2.containsKey(b.charAt(i))){
                word2.put(b.charAt(i), 1 + word2.get(b.charAt(i)));
            }else{
                word2.put(b.charAt(i), 1);
            }
        }

        for(int i =0; i < a.length(); i++){
            if(word1.get(a.charAt(i)) != word2.get(a.charAt(i))){
                return false;
            }
        }

        return true;
    }
}
