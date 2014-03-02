/*
 * Follow up for "Remove Duplicates"
 * What if duplicates are allowed at most twice?
 * For example,
 * Given sorted array A = [1,1,1,2,2,3];
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 */

 public class Solution{
    public int removeDuplicates(int[] A){
        if ( A == null || A.length == 0){
            return 0;
        }
        int current = A[0];
        boolean isSecond = false;
        int count = 1;
        for(int i = 1 ; i < A.length; i ++){
            if(A[i] == current){
                if(!isSecond){
                    isSecond = true;
                    A[count] = A[i];
                    count++;
                }else{
                    continue;
                }
            }else{
                A[count] = A[i];
                count++;
                current = A[i];
                isSecond = false;
            }
        }
        return count;
    }
 }
