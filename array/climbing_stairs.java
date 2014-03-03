/*
 * You are climbing as stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */

 public class Solution{
     public int climbStairs( int n ){
         if( n  <= 0){
             return 0;
         }
         if( n == 1 ){
             return 1;
         }
         int accumulate[] = new int[n+1];

         accumulate[0] = 1;
         accumulate[1] = 1;
         for( int i = 2 ; i <= n ; i++){
            accumulate[i] = accumulate[i-1]+accumulate[i-2];
         }
         return accumulate[n];
     }
 }
