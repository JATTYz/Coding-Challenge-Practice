package AlgorithmI;

import java.util.HashSet;
import java.util.Set;

public class candies {
    public int solution(int[] candyType){

        int canEat = candyType.length / 2;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i< candyType.length; i++){
            set.add(candyType[i]);
        }

        if(candyType.length == 2){
            return 1;
        }

        if(canEat > set.size()){
            return set.size();
        }
        return canEat; 
    }
}
