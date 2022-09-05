package AlgorithmI;

public class FindTheDifference {
    
    //space= O(1)
    //Time = O(n)
    public char solution(String s ,String t){

        char ch = 0;
        for(char i : s.toCharArray()) {
            ch ^= i;
        }
        
        for(char j : t.toCharArray()) {
            ch ^= j;
        }
        
        return ch;
    }
}
