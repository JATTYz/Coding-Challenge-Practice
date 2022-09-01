package Classic;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public List<Integer> solution(List<Integer> a, List<Integer> b){
        int scoreA = 0;
        int scoreB = 0;
        int length = a.size();
        for(int i = 0; i < length; i++){
            if(a.get(i) > b.get(i)){
                scoreA++;
            }else if(a.get(i) < b.get(i)){
                scoreB++;
            }
        }   
        List<Integer> answer = new ArrayList<>();
        answer.add(scoreA);
        answer.add(scoreB);
        
        return answer;
        
        }
    }
}
