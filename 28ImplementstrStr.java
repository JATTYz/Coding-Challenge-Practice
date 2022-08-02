import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ImplementstrStr {
   public static void main(String[] args) {
    
    String a = "hellllo";
    String b = "ll";
   System.out.println(Str(a,b)); 
    
   
   } 

   public static int Str(String haystack, String needle){

        if(haystack.isEmpty()){
            return 0;
        }

        for(int i = 0; i <= haystack.length() - needle.length(); i++){

            if(haystack.substring(i, needle.length()+i).equals(needle))return i;
        
        }
        
       return -1; 
   }
}
