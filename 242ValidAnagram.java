import java.util.Arrays;

class Main {

    public static boolean isAnagram(String s, String t){

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }

    public static void main(String[] args) {
       System.out.println(isAnagram("anagram", "nagaram"));

       System.out.println(isAnagram("cat", "car"));
        
    }
}