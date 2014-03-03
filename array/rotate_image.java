/*
 * You are given an n*n 2D matrix representing an image.
 * Rotate the image by 90 degrees ( clockwise).
 * Follow up:
 * Could you do this in-place?
 */

 public class Solution{
     public void rotate(int[][] matrix){
         if( matrix == null || matrix.length == 0){
             return;
         }

         int n = matrix.length-1;
         int start = 0;
         int end = n;
         while(start < end){
             for ( int j = start; j < end; j++){
                 int temp = matrix[start][j];
                 matrix[start][j] = matrix[n-j][start];
                 matrix[n-j][start] = matrix[n-start][n-j];
                 matrix[n-start][n-j] = matrix[j][n-start];
                 matrix[j][n-start] = temp;
             }
             start++;
             end--;
         }
     }
 }
         
