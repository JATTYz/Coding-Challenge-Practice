package Classic;

import java.util.List;

public class SimpleArraySum {
    
    public int solution(List<Integer> nums){

        int answer = 0;
        
        for(int i =0 ;i < nums.size();i++){
            
            answer += nums.get(i);
        }
        
        return answer;
    }
}
