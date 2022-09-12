package AlgorithmI;

class ReverseStringll{

    public String soltuion(String s , int k){

        StringBuilder a = new StringBuilder();

        String r = s.substring(0,k);
        String same = s.substring(k, s.length());

       a.append(r).reverse(); 
       a.append(same);
       //not finish yet => still error
       return a.toString();
    }
}
