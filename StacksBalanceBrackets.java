import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        
        Stack s = new Stack();
        //check for a specific scenario where  you have a left hand expression but not a right hand complete expression.
        Boolean b = false;
        //loop through the expression
        
        for(int i = 0; i < expression.length();i++){
            char ch = expression.charAt(i);
            //use switch statement setup stack and validate
        switch(ch){
            case '(':
                //System.out.println(ch);
                s.push(ch);
                break;
                //if left hand character for the expression, push it on the stack. This is true for the other two cases.
            case '{':
                //System.out.println(ch);
                s.push(ch);
                break;
            case '[':
                //System.out.println(ch);
                s.push(ch);
                break;
            case ')':
                //System.out.println(ch);
                //If the stack is not empty and a right hand symbol has been identified, peek at the top element of the stack
                //if the top of the stack has a left hand element pop the stack and set the boolean b to true.
                //Setting b to true ensures there is at least one right hand element that has a match.
                if(!s.empty()&& s.peek()=='('){
                    s.pop();
                    b = true;}
                else
                    return false;
                break;
            case '}':
                //System.out.println(ch);
                if(!s.empty()&&s.peek()=='{'){
                    s.pop();
                    b = true;}
                else
                    return false;
                break;
            case ']':
                //System.out.println(ch);
                if(!s.empty()&&s.peek()=='['){
                    s.pop(); b = true;}
                else
                    return false;
                break;
            default:
                System.out.println("UNKOWN SWITCH OPTION");
        
            }
        }
        return b;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
