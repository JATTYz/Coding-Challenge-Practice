package AlgorithmI;

public class DynamicStair {
    public int solution(int n){
        int[] t = new int[n+1];
        t[0]=1;
        t[1]=1;
        
        for(int i =2; i<t.length;i++){
            t[i] = t[i-1]+t[i-2];
        }
        return t[n];
    }
}
