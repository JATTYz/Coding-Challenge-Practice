package AlgorithmI;

public class NumOfStep {
    
    public int solution(int num){
        int step = 0;
        while(num > 0){
            if(num % 2 == 0){
                num = num/2;
                step++;
            }else{
                num = num - 1;
                step++;
            }
        }
        
        return step;
        //Time Complexcity = O(n)
        //Space Complexcity = O()
    }
}
