package AlgorithmI;

public class SelectSort {

    public static void main(String[] args) {

        int[] arr=  {1,3,4,2,5,7,6,9,8};

        selectionSort(arr);

        for(int a : arr){
            System.out.print(a);
        }
    }

    private static void selectionSort(int[] arr) {

        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
