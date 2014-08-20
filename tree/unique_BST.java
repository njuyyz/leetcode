/*
 * Given n, how many structurally unique BST's (binary search trees) the store values 1..n?
 */

 public class Solution{
     public int numTree( int n ){
         if( n < 0){
             return -1;
         }
         if( n == 0 ){
             return 0;
         }
         int count[] = new int[n+1];
         count[0] = 1;
         count[1] = 1;

         for( int i = 2 ; i < n+1; i++){
             int tempCount = 0 ;
             for( int j = 0;j<=i-1;j++ ){
                 tempCount += count[j]*count[i-1-j];
             }
             count[i] = tempCount;
         }
     }
 }
