/*
 * There are two sorted arrays A and B of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log(m+n))
 */

 public class Solution{

    public double findMedianSortedArrays( int A[], int B[]){
        if(A==null && B == null){
            return 0;
        }

        int size = A.length + B.length;
        if(size <= 0 ){
            return 0;
        }

        //if there are odd number of items
        if( size %2 == 1){
            return find(A,B,0,A.length-1,0,B.length-1,size/2+1);
        }
        else{
            int sum = find(A,B,0,A.length-1,0,B.length-1,size/2+1) + find( A,B,0,A.length-1,0,B.length-1,size/2);
            return sum/2.0;
        }

    }
    public int find(int A[], int B[], int startA, int endA, int startB, int endB, int targetSize){
        // alway let the small size array be A.
        if(A.length > B.length){
            return find(B,A,startB,endB,startA,endA,targetSize);
        }

        // if we checked all the items in A
        if(startA > endA){
            return B[startB+targetSize-1];
        }

        // if we checked all the items in B
        if(startB > endB){
            return A[startA+targetSize-1];
        }

        if(targetSize == 1){
            return A[startA] < B[startB] ? A[startA] : B[startB];
        }

        // we plan to compare targetSize/2 items in A, 
        // so the index for the last comparing item should be
        // startA + targetSize/2 - 1, but it might exceed the size of A
        // hence we should choose the minimal of it and endA
        int indexA = (startA + targetSize/2-1) < endA ? (startA + targetSize/2-1) : endA;

        // plan to compare remaining number of items in B
        int indexB = targetSize - (ak - startA+1) + startB -1;
        
        if( A[indexA] > B[indexB]){
            // means the items we compared in array B
            // can not have the target item we are looking for
            // so we get rid of such length of array B
            // hence we should compare the remaining (indexA - startA + 1) number of items
            return find(A,B,startA,endA, indexB +1, endB, indexA - startA + 1)
        }
        else if ( A[indexA] < B[indexB]){
            return find(A,B, indexA+1, endA, startB,endB, targetSize - (indexA - startA +1));
        }
        else{
            // if A[indexA] == B[indexB], we find the item
            return A[indexA];
        }
    }
 }  
