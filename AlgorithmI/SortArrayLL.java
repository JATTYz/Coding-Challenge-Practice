package AlgorithmI;

public class SortArrayLL {

    public int[] solution(int[]nums){
         int p1 = 0;
        int p2 = 1;
        int[] answer = new int[nums.length];
        
        for(int i =0; i< nums.length; i++){
            if(nums[i] % 2 == 0){
                answer[p1] = nums[i];
                p1 = p1 + 2;
              
            }else{
                answer[p2] = nums[i];
                p2 = p2+2;
            }
        }
        
        return answer;
    }
}
