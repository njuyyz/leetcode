/**
 * Given a string containing just the characters '(' nad ')', find the length of the longest valid (well-formed)
 * parentheses substring.
 **/

public class Solution {

    class Item {
        int length;
        char c;
        public Item(char c, int length) {
            this.length = length;
            this.c = c;
        }
    }

    public int longestValidParentheses(String s) {
        char[] array = s.toCharArray();
        Stack<Item> stack = new Stack<Item>();
        stack.push(new Item('*',0));
        int max = 0;

        for (char c: array) {
            if( c == '(' ) {
                stack.push(new Item('(',0));
            } else {
                if (stack.size() >= 2) {
                    Item item = stack.pop();
                    int count = temp.length + 2;
                    Item base = stack.pop();
                    base.length = base.length + count;

                    if ( base.length > max) {
                        max = base.length;
                    }
                    
                    stack.push(base);
                } else {
                    Item base = stack.pop();
                    base.length = 0;
                    stack.push(base);
                }
            }
        }
        return max;
    }
}
