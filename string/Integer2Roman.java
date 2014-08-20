/**
 * Given an Integer, convert it to a roman numeral.
 **/

public class Solution {
    public String intToRoman( int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while( num != 0) {
            int count = num/values[i];
            String symbol = symbols[i];
            while( count != 0) {
                sb.append(symbol);
                count --;
            }
            num %= values[i];
            i++;
        }
        return sb.toString();
    }
}
