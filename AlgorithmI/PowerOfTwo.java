package AlgorithmI;

public class PowerOfTwo {
   public boolean isPowerOfTwo(int n) {
         
        
        if( n > 1){
            
            while( n % 2 == 0 ){
                n = n/2;
            }
        }
        
        if(n == 1){
            return true;
        }
    
        return false;
    } 

    public boolean solution(int n){
        if(n < 1){
            return false;
        }
        for(int i =0;i<32;i++){
            if(n == (1<<i)){
                return true;
            }
        }
        
        return false;
    }
}
