/*
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must
 * be less than index2. Please bote that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 *
 * Input: numbers={2,7,11,15}, target = 9
 * Output: index1=1, index2=2
 */

 public class Solution{
    public int[] twoSum(int[] numbers, int target){
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

        if(numbers == null || numnbers.length < 2){
            return null;
        }

        for( int i = 0; i < numbers.length; i++){
            map.put(target - numbers[i],i);
        }
        int[] indexes = new int[2];

        for( int i = 0 ; i < numbers.length; i++){
            if ( map.hasKey( numbers[i]) && i != map.get(numbers[i])){
                int index1 = i < map.getValue(numbers[i])? i : map.getValue(numbers[i]);
                int index2 = i > map.getValue(numbers[i])? i : map.getValue(numbers[i]);
                indexes[0] = index1+1;
                indexes[1] = index2+1;
                break;
            }
        }
        return indexes;

    }

 }
