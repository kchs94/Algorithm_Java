package 프로그래머스.레벨1;

import java.util.Arrays;

public class 잘라서배열로만들기 {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int quotient = len / n;
        int remainder = len % n;
        int size;
        if (remainder == 0)
            size = quotient;
        else
            size = quotient + 1;
        String[] answer = new String[size];

        for (int i=0; i<size-1; i++) {
            answer[i] = my_str.substring(n*i, n*i + n);
        }
        answer[size-1] = my_str.substring((n-1)*(quotient));

        return answer;
    }

    public static void main(String[] args) {
        잘라서배열로만들기 sol = new 잘라서배열로만들기();
        System.out.println(Arrays.toString(sol.solution("abc1Addfggg4556b", 6)));
    }
}
