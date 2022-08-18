package DataStructure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BeySellStrock {
    public int solution(int[] prices){
        int minStockValue = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i: prices){
            if(i < minStockValue) minStockValue = i;
            if(maxProfit < i - minStockValue) maxProfit = i - minStockValue;
        }

        return maxProfit;
    }
   
    public int maxProfit(int[] prices){

        ArrayList<Integer> arr = new ArrayList<>();

        int start = 0;
        int end =prices.length;
        while(start < end){

            for(int i = start + 1; i< end;i++){
                if(prices[i] - prices[start] >0){
                    arr.add(prices[i] - prices[start]);
                }
            }
            start++;
        }

        Collections.sort(arr);        

        if(arr.isEmpty()){
            return 0;
        }else{
            int ans = arr.get(arr.size()-1);

            return ans > 0 ? ans : 0;
        }
      
    }
}
