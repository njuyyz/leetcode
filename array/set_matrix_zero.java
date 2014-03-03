/*
 * Given a m * n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
 */

 public class Solution{
     public void setZeroes(int[][] matrix){
         if(matrix == null || matrix.length == 0){
             return;
         }
         boolean isRowOneZero = false;
         for( int i = 0 ; i < matrix[0].length; i++){
             if(matrix[0][i] == 0){
                 isRowOneZero = true;
                 break;
             }
         }
         for( int i = 1; i < matrix.length; i++){
             boolean isRowZero = false;
             for( int j = 0 ; j < matrix[0].length; j++){
                 if(matrix[i][j] == 0){
                     isRowZero = true;
                     matrix[0][j] = 0;
                 }
             }
             if(isRowZero){
                 setRowZero(matrix,i);
             }
         }
         for(int i = 0 ; i < matrix[0].length; i++){
             if(matrix[0][i] == 0){
                 setColumnZero(matrix,i);
             }
         }
         if(isRowOneZero){
             setRowZero(matrix,0);
         }
     }
     public void setRowZero(int[][] matrix, int row){
         for(int i = 0; i < matrix[0].length; i++){
             matrix[row][i] = 0;
         }
     }
     public void setColumnZero(int[][] matrix, int column){
         for(int i = 0; i < matrix.length; i++){
             matrix[i][column] = 0;
         }
     }
 }
