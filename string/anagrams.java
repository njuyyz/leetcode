/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * All inputs will be in lower-case.
 *
 * Group all the anagrams together and put them into a list sequentially.
 **/

public class Solution {
    public List<String> anagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        for(String s : strs) {
            char[] tempArray = s.toCharArray();
            tempArray = countSort(tempArray);
            String tempString = new String(tempArray);
            ArrayList<String> arrayList = null;
            if(map.containsKey(tempString)) {
                arrayList = map.get(tempString);
            }else {
                arrayList = new ArrayList<String>();
            }
            arrayList.add(s);
            map.put(tempString,arrayList);
        }
        ArrayList<String> list = new ArrayList<String>();
        for(String key : map.keySet()) {
            if(map.get(key).size() > 1) {
                list.addAll(map.get(key));
            }
        }
        return list;
    }

    private char[] countSort(char[] input) {
        int[] count = new int[26];
        for(char c: input) {
            count[c-'a'] += 1;
        }
        int index = 0;
        for ( int i = 0; i<26; i++) {
            while(count[i] != 0) {
                input[index] = (char)(((int)'a') + i);
                index++;
                count[i] = count[i] -1 ;
            }
        }
        return input;
    }

}

                
