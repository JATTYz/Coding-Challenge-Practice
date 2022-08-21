package AlgorithmI;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {

    public void lengthOfLongestSubString(String s){

        HashMap<Character,Integer> hash = new HashMap<>();

        int left =0;
        int right = 0;
        int len =0;

        for(int i = 0; i < s.length(); i++){
           if(hash.containsKey(s.charAt(i))){
                left = Math.max(hash.get(s.charAt(i)), left);
           }else{
                hash.put(s.charAt(right),right);
                len = Math.max(len, right-left+1);
                right++;
           }
        }
        System.out.println(hash);
    }
    
    public int solution(String s){

        HashSet<Character> hash = new HashSet<>();

        int stable =0;
        int unstable = 0;
        int len = 0;

        while(unstable < s.length()){

            if(!hash.contains(s.charAt(unstable))){
                hash.add(s.charAt(unstable));
                unstable++;
                len= Math.max(len, hash.size());
            }else{
                hash.remove(s.charAt(stable));
                stable++;
                System.out.println(hash);
            }    
        }
        return len;
    }
}
