/**
 * Given a string containing just the characters '(',')','{','}','[',']', determine if the input string is valid.
 **/

public class Solution {
    public boolean isValid(String s) {
        if( s== null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] pars = s.toCharArray();
        for(char parethese : pars) {
            switch( parethese) {
                case '(':
                case '{':
                case '[':
                    stack.push(parethese);
                    break;
                case ')':
                    if (stack.empty()){
                        return false;
                    }else {
                        char top = stack.pop();
                        if(top != '(' ) {
                            return false;
                        }
                    }
                    break;
                case '}':
                    if (stack.empty()) {
                        return false;
                    } else {
                        char top = stack.pop();
                        if(top != '{' ) {
                            return false;
                        }
                    }
                    break;
                case ']':
                    if(stack.empty()) {
                        return false;
                    }else {
                        char top = stack.pop();
                        if( top != '[' ) {
                            return false;
                        }
                    }
                    break;
                default:
                    return false;
            }
        }
        if( stack.empty()){
            return true;
        }
        return false;
    }
}

