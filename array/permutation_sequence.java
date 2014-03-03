/*
 * The set [1,2,...,n] contains a total ofn! unique permutations.
 * By listing and labeling all the permutations in order...
 * Given n and k, return the k th permutation sequence.
 * Note Given n will be between 1 and 9 inclusive.
 */

 public class Solution{
     public String getPermutation(int n, int k){
         if( n <= 0 || k <= 0){
             return "";
         }

         String s = "";
         //list all the items in an array
         int digits[] = new int[n];
         for(int i = 0; i < n; i++){
             digits[i] = i+1;
         }
        
         int size = n;
         while(n>1){
             int digit = (k-1)/factorial(n-1);
             int value = -1;
             for(int i = 0; i < size; i++){
                 if(digit == 0){
                     if(digits[i]!=-1){
                         value = digits[i];
                         digits[i] = -1;
                         break;
                     }
                 }else{
                     if(digits[i] != -1){
                         digit --;
                     }
                 }
             }
             s += value;
             k = (k-1)%factorial(n-1) +1;
             n--;
         }
         for(int i = 0 ; i < size; i++){
             if(digits[i]!=-1){
                 s+=digits[i];
                 break;
             }
         }
         return s;
     }

     public int factorial(int n){
         int result = 1;
         for(int i=1; i<= n; i++){
             result*=i;
         }
         return result;
     }
 }

