/**
 * Given an absolute path for a file( Unix-style), simplify it.
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/",=> "/c"
 **/

public class Solution {
    public String simplifyPath(String path) {
        if(path == null || path.length() == 0) {
            return null;
        }
        
        boolean isRoot = false;
        if(path.charAt(0) == '/' ){
            isRoot = true;
        }
        Stack<String> stack = new Stack<String>();
        String[] levels = path.split("/");
        for(String level: levels) {
            if(level != null && !level.equals("")) {
                if(level.equals(".")){
                    continue;
                }else if( level.equals("..")){
                    if( stack.empty() && isRoot) {
                        continue;
                    }else if ( stack.empty() || stack.peek().equals("..")){
                        stack.push(level);
                    }else{
                        stack.pop();
                    }
                }else{
                    stack.push(level);
                }
            }
        }
        String current;
        StringBuilder sb = new StringBuilder();
        while(!stack.empty()) {
            current = stack.pop();
            sb.insert(0,current);
            sb.insert(0,"/");
        }
        String re;
        if( !isRoot) {
            sb.deleteCharAt(0);
        }else if(sb.toString().length() == 0){
            re = "/" + sb.toString();
        }else{
            re = sb.toString();
        }
        return re;
    }


