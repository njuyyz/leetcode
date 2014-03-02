/*
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers. You may assume that each input would have exactly one solution.
 */

 public class Solution{
     public int threeSumClosest(int[] num, int target){
         if( num == null || num.length < 3){
             return 0;
         }

         int minGap = Integer.MAX_VALUE;
         int result = 0;

         // sort array
         Arrays.sort(num);

         for( int i = 0; i < num.length -2 ; i++){
             int indexB = i+1;
             int indexC = num.length-1;
             while(indexB < indexC){
                 int value = num[i] + num[indexB]+num[indexC];

                 if( minGap > Math.abs(target - value)){
                     minGap = Math.abs(target-value);
                     result = value;
                 }
                 if( target > value){
                     indexB++;
                 }
                 else if( target < value){
                     indexC--;
                 }
                 else{
                     return target;
                 }
             }
         }
         return result;
     }
 }

