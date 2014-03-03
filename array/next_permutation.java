/*
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * If such arrangement is not possible, it must rearrange it as the lowest possible order.
 * The replacement must be in-place, do not allocate extra memory.
 */
 public class Solution{
     public void nextPermutation( int[] num){
        if( num == null || num.length <= 1){
            return;
        }
        int index = num.length-1;
        while(index >0 && num[index] <= num[index-1]){
            index--;
        }
        index--;
        if(index != 0){
            int i = num.length -1;
            while(i > index && num[i] <= num[index]){
                i--;
            }
            //swap i and index
            int temp = num[i];
            num[i] = num[index];
            num[index] = temp;
            smallest(num,index+1);
        }
        else{
            smallest(num,0);
        }
     }
     
     public smallest(int[] num, int start){
        int end = num.length -1;
        while(start < end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
     }
 }
