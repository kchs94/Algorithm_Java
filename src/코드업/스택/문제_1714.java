package 코드업.스택;

import java.util.Scanner;
import java.util.Stack;

public class 문제_1714 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner in = new Scanner(System.in);
        String num = in.next();

        for(int i=0; i<num.length(); i++){
            stack.push(num.charAt(i) - '0');
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<num.length(); i++){
            sb.append(stack.pop());
        }

        System.out.println(sb);
    }
}
