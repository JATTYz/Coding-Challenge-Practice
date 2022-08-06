class RunCodeee {

  // public static void main(String[] args) {
  //    String[] input = {"flower", "flow", "floight"};
  //    String answer = longestCommonPrefix(input);
     
  //    System.out.println(answer);

  // }  

  public static String longestCommonPrefix(String[] strs){
    String prefix = strs[0];

    for(int i = 1; i < strs.length && !prefix.isEmpty(); i++){

        while(!strs[i].startsWith(prefix)){
            prefix = prefix.substring(0, prefix.length()-1);
        }
    }

    return prefix;
  }
}
