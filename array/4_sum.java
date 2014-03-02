/* 
 * Given an array S of n integers, are there elements a,b,c and d in S such that a + b + c + d = target? Find all unique
 * quadruplets in the array which gives the sum of target.
 */

 public class Solution{
     public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target){
         ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

         if( num == null || num.length < 4){
             return list;
         }

         // sort array first
         Arrays.sort(num);

         // store pair sum into a hashmap
         HashMap<Integer,ArrayList<int[]>> map = new HashMap<Integer,ArrayList<int[]>>();
         for(int i = 2; i < num.length -1; i ++){
             for (int j = i+1; j < num.length; j++){
                 int sum = num[i] + num[j];
                 if( map.containsKey(sum)){
                     map.get(sum).add(new int[]{i,j});
                 }else{
                     ArrayList<int[]> tempList = new ArrayList<int[]>();
                     tempList.add(new int[]{i,j});
                     map.put(sum,tempList);
                 }
             }
         }

         //store the temp results in a hashset in order to remove duplicates
         HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();

         for( int i=0; i < num.length -3; i++){
             for ( int j = i+1; j< num.length-2; i++){
                 if(map.containsKey(target-num[i]-num[j])){
                     ArrayList<int[]> arrayList = map.get(target-num[i]-num[j]);
                     for(int m = 0 ; m < arrayList.size(); m++){
                         if(arrayList.get(m)[0] > j){
                             ArrayList<Integer> array = new ArrayList<Integer>();
                             arraylist.add(num[i]);
                             arraylist.add(num[j]);
                             arraylist.add(arrayList.get(m)[0]);
                             arraylist.add(arrayList.get(m)[1]);

                             // when the set add new element into the set, it well check if there is a same value
                             // element in the set. in order to compare the elements, the set will compare the hashcode
                             // of the new elements with the old ones. hashcode() for int[] is inherented from Object,
                             // and its hashcode comes from the address of the object. hashcode() for ArrayList is
                             // overriden, its hashcode comes from the value of the items in the list.
                             set.add(arraylist);
                         }
                     }
                 }
             }
         }

         for (ArrayList<Integer> arrayList: set){
             list.add(arrayList);
         }
         return list;
     }
 }
                

