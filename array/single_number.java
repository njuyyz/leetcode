/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
 public class Solution{
     public int singleNumber(int[] A){
         if(A == null || A.length == 0){
             return -1;
         }
         if(A.length == 1){
             return A[0];
         }
         int a = 0;
         for(int i = 0 ; i < A.length; i++){
             a = a^A[i];
         }
         return a;
     }
 }
