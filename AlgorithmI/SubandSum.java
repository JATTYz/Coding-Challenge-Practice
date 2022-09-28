package AlgorithmI;

public class SubandSum {
    public int solution(int n){
         int mul =1;
        int sum = 0;
        int s = 0;
        
        while(n != 0){
            s = (int)n % 10;
            System.out.println(s);
            mul *= s;
            sum += s;
             n = (int)n / 10;
             System.out.println(mul);
             System.out.println(sum);
             System.out.println(n);
        }
        
        return mul-sum;
    }
}
