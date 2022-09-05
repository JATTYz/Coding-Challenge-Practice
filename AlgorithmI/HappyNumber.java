package AlgorithmI;

import java.util.Arrays;
import java.util.HashSet;

public class HappyNumber {
   
    public boolean solution(int n){
        HashSet<Integer> set = new HashSet<>();

        while(n > 1){
            int sum = 0;

            while(n > 0){
                int temp = n % 10;
                n = n / 10;
                sum += (temp*temp);
            }
            if(set.contains(sum))return false;

            set.add(sum);

            n = sum;
        }
        return true;

    }

}
