package AlgorithmI;

public class Onlyletter {
    
    public String solution(String s){

        int start = 0;
        int end = s.length() - 1;
        char[] a = s.toCharArray();

        while(start < end){
            if(Character.isLetter(s.charAt(start)) && 
                Character.isLetter(s.charAt(end))){
                    a[end] = s.charAt(start);
                    a[start] = s.charAt(end);
                    start++;
                    end--;
            }else if(!Character.isLetter(s.charAt(start))){
                start++;
            }else if(!Character.isLetter(s.charAt(end))){
                end--;
            }
        }

        return new String(a);
    }

}
