package exercise.exercise_0705;

/*
矩阵置零
 */
/*
class Solution {
    public void setZeroes(int[][] matrix) {
        int MODIFIED = -1000;
        boolean f = true;
        for(int i=0;i<matrix.length; i++){
            for(int j=0;j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    for(int m=0;m<matrix.length; m++){
                        if(matrix[m][j] != 0){
                            matrix[m][j] = MODIFIED;
                        }
                    }
                    for(int n=0;n<matrix[i].length; n++){
                        if(matrix[i][n] != 0){
                            matrix[i][n] = MODIFIED;
                        }
                    }
                }
            }
        }
        for(int i=0;i<matrix.length; i++){
            for(int j=0;j<matrix[0].length; j++){
                if(matrix[i][j] == MODIFIED){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
*/


class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rowFlag = false;
        boolean colFlag = false;
        for(int i=0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                rowFlag = true;
            }
        }
        for(int j=0; j<matrix[0].length; j++){
            if(matrix[0][j] == 0){
                colFlag = true;
            }
        }
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for(int i=1; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                for(int k =1; k<matrix[0].length; k++){
                    matrix[i][k] = 0;
                }
            }
        }
        for(int j=1; j<matrix[0].length; j++){
            if(matrix[0][j] == 0){
                for(int k =1; k<matrix.length; k++){
                    matrix[k][j] = 0;
                }
            }
        }
        if(rowFlag){
            for(int i=0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        if(colFlag){
            for(int j=0; j<matrix[0].length; j++){
                matrix[0][j] = 0;
            }
        }
    }
}