package AlgorithmI;

public class AvgSalary {
    public double Solution(int[] salary){
          
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i : salary){
        
            if(i > max){
                max = i;
            }
            
            if(i < min){
                min = i;
            }
            
        }
        
        
        double avg = 0;
        
        for(int i = 0; i< salary.length; i++){
                
            if(!(salary[i] == max || salary[i] == min)){
                
                avg += salary[i];
                
            }
            
        }
   
        double answer = avg / (salary.length - 2);
        
        return answer;
    }
}
