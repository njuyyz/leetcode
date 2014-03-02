/*
 * Follow up for " Search in Rotated Array": What if duplicates are allowed?
 * Would this affect the run-time complexity? How and Why?
 * Write a function to determine if a given target is in the array.
 */

 public class Solution{
    public int search(int A[], int target){
        int start = 0;
        int end = A.length -1;

        while (start <= end){
            int mid = start + (end-start)/2;
            if(target == A[start]){
                return start;
            }
            if(target == A[mid]){
                return mid;
            }

            if( A[start] > A[mid]){
                if(target > A[start] || target < A[mid]){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
            else if( A[start] < A[mid]){
                if(target < A[start] || target > A[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
            else{
                start ++;
            }
        }
    }

 }
