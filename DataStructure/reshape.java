package DataStructure;

public class reshape {
    
    public int[][] matrixReshape(int[][] mat, int r, int c){

        if(mat.length * mat[0].length != r * c ) 
        return mat;

        int answer[][] = new int[r][c];

        int p1= 0; 
        int p2 = 0;

        for(int i = 0; i<mat.length; i++){
            for(int j =0; j < mat[i].length; j++){
                answer[p1][p2++] = mat[i][j];
                if(p1 == r)break;
                if(p2==c){
                    p1++;
                    p2 =0;
                }
            }
        }
        return answer;
    }
}
