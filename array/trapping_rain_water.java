/*
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water
 * it is able to trap after raining.
 */
 public class Solution{
     public int trap(int[] height){
         if(height == null || height.length<3){
             return 0;
         }
         int leftHigh[] = new int[height.length];
         int rightHigh[] = new int[height.length];

         int max = height[0];
         for(int i = 0 ; i < height.length; i++){
             leftHigh[i] = max;
             if(height[i] > max){
                 max = height[i];
             }
         }
         
         max = height[height.length-1];
         for(int i = height.length-1;i >= 0; i--){
             rightHigh[i] = max;
             if(height[i] > max){
                 max = height[i];
             }
         }

         int sum = 0;
         for(int i= 0; i < height.length; i++){
             int lowest = leftHigh[i]<rightHigh[i]?leftHigh[i]:rightHigh[i];
             if(lowest > height[i]){
                 sum+=(lowest -height[i]);
             }
         }
         return sum;
     }
 }
