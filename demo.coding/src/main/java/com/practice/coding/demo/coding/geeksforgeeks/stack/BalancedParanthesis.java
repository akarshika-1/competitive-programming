package com.practice.coding.demo.coding.geeksforgeeks.stack;

import java.util.Stack;

public class BalancedParanthesis {

    public static boolean areParanthesisBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }
            if(stack.empty()){
                return false;
            }
            char check;
            switch (c){
                case ')':
                    check = stack.pop();
                    if(check=='['||check=='{')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if(check=='('||check=='{')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if(check=='('||check=='[')
                        return false;
                    break;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args){
        System.out.println(areParanthesisBalanced("[()]{}{[()()]()}"));
        System.out.println(areParanthesisBalanced("[(])"));
        System.out.println(areParanthesisBalanced("}]]))"));
        System.out.println(areParanthesisBalanced("[()]({{}}[]){[()()]()}"));

    }
}
