package AlgorithmI;

public class CountOdd {
    
    public int myasn(int low, int high){
        int answer = 0;
        
        for(int i = low; i<= high; i++){
            
            if(i % 2 != 0){
                answer++;
            }
        }
        
        return answer;
    }

    public int bestSolution(int low, int high){
         if (low%2==0) low++;
	
    if(low>high) return 0;
	
    return (high-low)/2+1;
    }
}
