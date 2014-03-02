/*
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * For example,
 * Given [ 100, 4, 200, 1,3,2],
 * the longest consecutive elements sequence is [1,2,3,4]. Return its length: 4.
 * Your algorithm should run in O(n) complexity.
 */

 public class Solution{
    public int longestConsecutive(int[] num){
        if(num ==null || num.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> viewedSet = new HashSet<Intger>();

        for( int i : num){
            set.add(i);
        }
        int maxLength = 0;
        for(int i : set){
            if(viewedSet.contains(i)){
                continue;
            }
            viewedSet.add(i);
            int tempLength = 1;
            int j = i-1;
            while(set.contains(j)){
                if(viewedSet.contains(j)){
                    break;
                }
                viewedSet.add(j);
                tempLength++;
                j--;
            }
            j = i+1;
            while(set.contains(j)){
                if(viewedSet.contains(j)){
                    break;
                }
                viewedSet.add(j);
                tempLength++;
                j++;
            }
            if(tempLength > maxLength){
                maxLength = tempLength;
            }
        }
        return maxLength;
    }
 }
