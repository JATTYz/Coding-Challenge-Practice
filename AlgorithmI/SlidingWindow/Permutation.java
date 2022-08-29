package AlgorithmI.SlidingWindow;

import java.util.Arrays;

public class Permutation {

    public boolean checkInclustion(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();

        //Character count each string
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(char c : s1.toCharArray()){
            count1[c - 'a']++;
            System.out.println(count1.toString());
        }

        int left = 0;

        for(int right =0; right < len2; right++){
            count2[s2.charAt(right) - 'a']++;

            while(right - left + 1 > len1){
                count2[s2.charAt(left) - 'a']--;
                left++;
            }

            if(Arrays.equals(count1,count2))return true;
        }

        return false;
    }

}
