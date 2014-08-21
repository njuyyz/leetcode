/**
 * Given a roman numberal, convert it to an integer.
 **/

public class Solution {
    public int romanToInt(String s) {
        if( s == null || s.length() == 0) {
            return 0;
        }

        Hashtable<Character,Integer> table = new Hashtable<Character,Integer>();
        table.put('M',1000);
        table.put('D',500);
        table.put('C',100);
        table.put('L',50);
        table.put('X',10);
        table.put('V',5);
        table.put('I',1);

        char[] array = s.toCharArray();
        char currentChar = array[0];
        int former = table.get(currentChar);
        int value = former;
        for( int i = 1; i < array.length; i++){
            int temp = table.get(arrau[i]);
            if(temp > former) {
                value = value - former*2 + temp;
            }else{
                value += temp;
            }
            former = temp;
        }
        return value;
    }
}
