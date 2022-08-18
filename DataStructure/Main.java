package DataStructure;



public class Main {
   
    public static void main(String[] args) {

        int[] nums = {1,2,2,1};
        int[] nums2 = {2,2};

        IntersectionofTwo test = new IntersectionofTwo();
        int[] a = test.intersect(nums, nums2);
        for(int i : a){
          System.out.println(i);
        }
    }
}
