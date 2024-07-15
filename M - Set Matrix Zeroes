class Solution {
    public void setZeroes(int[][] matrix) {
       boolean fRow = false, fCol = false;

        //Check if there is a 0 in the first row
       for(int i = 0;i<matrix[0].length;i++) {
        if(matrix[0][i] == 0) {
            fRow = true;
            break;
        }
       }

         //Check if there is a 0 in the first col
        for(int i = 0;i<matrix.length;i++) {
        if(matrix[i][0] == 0) {
            fCol = true;
            break;
        }
       }

        //starting from row 1 and col 1, if there is any 0 in the matrix. set 0 to the corresponding row 0 and col 0
       for(int i = 1;i<matrix.length;i++) {
        for(int j = 1;j<matrix[0].length;j++) {
            if(matrix[i][j] == 0) {
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }
       }

        //Leaving the 0th row, check if there is any 0 in the 1st column, set 0 to the corresponding  row
       for(int i = 1;i<matrix.length;i++) {
        if(matrix[i][0] == 0) {
            for(int j = 1;j<matrix[0].length;j++) {
                matrix[i][j] = 0;
            }
        }
       }

//Leaving the 0th col, check if there is any 0 in the 1st row, set 0 to the corresponding  col
       for(int i = 1;i<matrix[0].length;i++) {
        if(matrix[0][i] == 0) {
            for(int j = 1;j<matrix.length;j++) {
                matrix[j][i] = 0;
            }
        }
       }

        // if there is any 0 in the first row
       if(fRow) {
        for(int i = 0;i<matrix[0].length;i++) {
            matrix[0][i] = 0;
        }
       }

       if(fCol) {
        for(int i = 0;i<matrix.length;i++) {
            matrix[i][0] = 0;
        }
       }
    }
}
