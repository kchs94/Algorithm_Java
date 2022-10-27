package 프로그래머스.레벨1;

import java.util.Stack;

/*
* 숫자이면 더하기
* "Z"이면 앞에 더했던 숫자 빼기
*
* 런타임에러 연달아 Z가 나왔을 때 예외를 빼먹었다.
*
* */
public class 컨트롤제트 {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        String[] arr = s.split(" ");

        for (int i=0; i< arr.length; i++) {
            if (arr[i].equals("Z")) {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(arr[i]));
            }
        }

        int sum = 0;
        for (Integer integer : stack) {
            sum += integer;
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "10 Z 2 0 \r Z Z Z Z /1";
        System.out.println(str);
    }
}
