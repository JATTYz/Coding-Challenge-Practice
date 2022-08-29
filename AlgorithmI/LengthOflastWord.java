package AlgorithmI;

public class LengthOflastWord {
    public int solution(String s){

        
        String[] a = s.split(" ");

        return a[a.length-1].length();

    }
}
