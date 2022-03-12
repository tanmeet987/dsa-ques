// you are given a string of exp representing an expression
// assume that the expression is balanced that is the opening and the closing brackets match with each other

import java.util.*;
import java.io.*;
public class duplicate{
  

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
char ch = str.charAt(i);
if(ch == ')'){
if(st.peek() == '('){
    System.out.println(true);
return;
}
}else{
    while(st.peek() != '('){
        st.pop();
    }
    st.pop();
}
}
else{
    st.push(ch);
}
        }
        System.out.println(false);

    }
