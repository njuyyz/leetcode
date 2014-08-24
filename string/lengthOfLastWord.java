/**
 * Given a string s consists of upper/lower-case alphabets and empty space of characters ' ', return the length of last
 * word in the String.
 **/

public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        String[] words = s.split(" ");
        if(words.length == 0) {
            return 0;
        }
        String lastWord = words[words.length - 1];
        return lastWord.length();
    }
}
