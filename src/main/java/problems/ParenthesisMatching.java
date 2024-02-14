package problems;

import java.util.Stack;

public class ParenthesisMatching {

    public static boolean match(char[] c){
        if(c.length == 0) return false;

        Stack<Character> s = new Stack<>();

        for(int i = 0; i < c.length; i++){

            if(c[i] == '{' || c[i] == '(' || c[i] == '['){
                s.push(c[i]);
                continue;
            }

            char lastElement = s.peek();
            if((lastElement == '(' && c[i] == ')') || (lastElement == '{' && c[i] == '}') || (lastElement == '[' && c[i] == ']')){
                s.pop();
            }else {
                return false;
            }
        }

        return s.isEmpty();
    }

    public static void main(String[] args) {

        //String s = "[{[]()}]";
        String s = "[]{(})";

        char[] c = s.toCharArray();
        boolean b = match(c);
        System.out.println(b);
    }
}
