/* 
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in
 * the  array which gives the sum of zero.
 * Note:
 * 1. Elements in a triplet(a,b,c) mush be in non-descending order. (ie. a <= b <= c)
 * 2. The solution set must not contain duplicate triplets.
 */

 public class Solution{
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        //first, sort the array
        Arrays.sort(num);

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        if( num == null || num.length < 3){
            return list;
        }

        // map: <value,index>
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        // put all the items into the map
        for(int i = 0 ; i < num.length; i++){
            map.put(num[i],i);
        }

        //find the triplets
        for ( int i = 0; i < num.length -2; ){

            for ( int j = i+1; i < num.length -1; ){
                int value = 0 - num[i] - num[j] ;
                if( map.containsKey(value) && map.get(value) > j){
                    ArrayList<Integer> subList = new ArrayList<Integer>();
                    subList.add(num[i]);
                    subList.add(num[j]);
                    subList.add(num[map.get(value)]);

                    // Sort ArrayList
                    Collections.sort(subList);
                    list.add(subList);
                }
                int formerJ = num[j];
                while( j < num.length -1 && formerJ == num[j]){
                    j++;
                }
            }

            int formerI = num[i];
            while(i < num.length-2 && formerI == num[i]){
                i++;
            }
        }
        return list;
    }
 }


