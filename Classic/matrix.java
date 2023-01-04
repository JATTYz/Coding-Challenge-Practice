class Matrix{
    public static void main(String[] args) {

    //    int[][] matrix = new int[4][4]; 

    //    for(int i = 0; i < matrix.length; i++){
    //         System.out.print("Row " + i + " : ");

    //         for(int j = 0; j < matrix[i].length; j++){
    //         System.out.print("Col " + j + "  ");
    //         }
    //         System.out.println();
    //    }
       int[][] matrix = { { 3, 2, 1, 7 },
					 { 9, 11, 5, 4 },
					 { 6, 0, 13, 17 },
					 { 7, 21, 14, 15 } };
		printMatrix(matrix);
    }

    public static void printMatrix(int matrix[][]){

        for(int i = 0; i < matrix.length; i++){

            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

}