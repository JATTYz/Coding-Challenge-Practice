package AlgorithmI;

public class ReverseWords {
    
    public String reverseWords(String s){
        
        String[] arr = s.split(" ");
        
        StringBuilder str = new StringBuilder();
        
        for(String i : arr) str.append(new StringBuilder(i).reverse()).append(" ");

        str.deleteCharAt(str.length()-1);

        return str.toString();     
    }
}
