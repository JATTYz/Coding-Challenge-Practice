package AlgorithmI;

public class smallIndex {
    
    public int solution(int[] nums){

        for(int i = 0 ; i< nums.length; i++){

            int x = i % 10;

            if(x == nums[i]){
                return i;
            }
        }

        return -1;

        //time = O(n)
        //space = O(1)
    }
}
