/*
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A
 * gray code sequence must begin with 0.
 */

 public class Solution{
     public ArrayList<Integer> grayCode(int n){
         ArrayList<Integer> list = new ArrayList<Integer>();

         if(n == 0 ){
             list.add(0);
             return list;
         }
         for( int i = 0 ; i < Math.pow(2,n); i++){
             int temp = i ^ (i >> 1);
             list.add(temp);
         }
         return list;
     }
 }
