/*
 * Given an array of integers, every element appears three times except for one. Find that single one.
 */

 public class Solution{
     public int singleNumber(int[] numbers){
         if (numbers == null || numbers.length == 0){
             return -1;
         }
         // for int, it at most has 32 bits.
         int array[] = new int [32];
         for( int i = 0 ; i < numbers.length; i++){
             String a = Integer.toBinaryString(a);
             for(int j = 0; j < a.length(); j++){
                 if(a.charAt[j] == '1'){
                     array[j]++;
                 }
             }
         }
         char chars[] = new char[32];
         for(int i = 0 ; i < 32; i++){
             if(array[i] % 3 != 0){
                 chars[i] = '1';
             }else{
                 chars[i] = '0';
             }
         }
         return Integer.parseInt(new String(c),2);
     }
 }
