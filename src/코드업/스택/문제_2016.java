package 코드업.스택;

import java.util.Scanner;
import java.util.Stack;

public class 문제_2016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();

        int lengthOfNum = in.nextInt();
        String[] num = in.next().split("");

        for(int i=0; i<lengthOfNum; i++)
            stack.push(num[i]);

        for(int i=1 ;i<=lengthOfNum; i++){
            sb.append(stack.pop());
            if(i%3 == 0 && !stack.empty())
                sb.append(",");
        }

        System.out.println(sb.reverse().toString());
    }
}
