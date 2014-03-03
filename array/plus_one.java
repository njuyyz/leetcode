/*
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 */
 public class Solution{
     public int[] plusOne(int[] digits){
         if( digits == null || digits.length == 0){
             return new int[0];
         }
         int[] result = new int[digits.length+1];
         int carry = 1;
         for( int i = digits.length -1 ; i >= 0; i--){
             result[i+1] = (digits[i] + carry)%10;
             carry = (digits[i]+carry)/10;
         }
         if(carry != 0 ){
             result[0] = carry;
             return result;
         }
         else{
             return Arrays.copyOfRange(result,1,result.length);
         }
     }
 }
