class BinarySearch {

    public static void main(String[] args) {
        System.out.println((6+4)/2 +1);
    }
    
    public int binarySearch(int[] nums, int target){

        int start= 0;
        int end = nums.length;
        int middle = (start + end)/2;

        while(start <= end){
            if(nums[middle] == target){
                return target;
            }else if(nums[middle] < target){
                start = middle;
            }else{
                end = middle;
            }
        }
        return -1;
    }
}