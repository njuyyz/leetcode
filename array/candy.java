/*
 * There are N children standing in a line. Each child is assigned a rating value.
 * You are giving candies to these children subjected to the following requiremnets:
 *  * Each child must have at least one candy.
 *  * Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 */
 public class Solution{
     public int candy(int[] ratings){
         if(ratings == null || ratings.length <= 1){
             return 1;
         }
         int[] candy = new int[ratings.length];
         for( int i = 1 ; i < ratings.length; i++){
             if(ratings[i] > ratings[i-1]){
                 candy[i] = candy[i-1]+1;
             }
         }
         for( int i = ratings.length-1; i>=1;i--){
             if(ratings[i-1] > ratings[i]){
                 candy[i-1] = candy[i-1]>(candy[i]+1)?candy[i-1]:(candy[i]+1);
             }
         }
         int sum = candy.length;
         for(int i = 0 ; i < candy.length; i++){
             sum += candy[i];
         }
         return sum;
     }
 }
