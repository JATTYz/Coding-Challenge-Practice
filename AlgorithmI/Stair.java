package AlgorithmI;

public class Stair {


    public int solution(int n){
        if(n==1||n==0){
            return 1;
        }

        return n * solution(n - 1);
    }
}
