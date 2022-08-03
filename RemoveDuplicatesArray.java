class RemoveDuplicatesArray {
    public static void main(String[] args) {
        
    }    

    public static int removeDuplicate(int[] n){

        int cur = n[0];
        int all = 0;
        for(int i = 1; i < n.length;i++){
            
            if(n[i] != cur){
                all++;
                n[all] = n[i];
                cur = n[i];
            }
        }

        return all+1;
    }
}
