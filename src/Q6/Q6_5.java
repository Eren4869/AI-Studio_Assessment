package Q6;

import java.util.Scanner;
import java.util.Stack;

public class Q6_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        boolean flag = true;
        for(char c : s.toCharArray()){
            if(c=='a'){
                stack.push(c);
            }else if(c=='b'){
                if(stack.isEmpty()){
                    flag=false;
                    break;
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()){
            flag=false;
        }
        if(flag){
            System.out.println("Good");
        }else {
            System.out.println("Bad");
        }
    }
}
