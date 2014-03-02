/*
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become  4 5 6 7 0 1 2).
 * You are given a target value to search. if found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 */

 public class Solution{
    public int search(int[] A, int target){
        int start = 0 ;
        int end = A.length -1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(target == A[mid]){
                return mid;
            }
            if( target == A[start]){
                return start;
            }
            if(A[mid] < A[start]){
                if( target > A[start] || target < A[mid]){
                    end = mid;
                }else if( target < A[start] &&  target > A[mid]){
                    start = mid + 1;
                }
            }
            else {
                if( target > A[mid] || target < A[start] ){
                    start = mid;
                }
                else if( target < A[mid] && target > A[start]){
                    end = mid-1;
                }
            }
        }
        if( A[start] == target){
            return start;
        }
        return -1;
    }
 }
