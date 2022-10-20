package 프로그래머스.레벨1;

import java.util.Arrays;
/*
* ...1..2..34..2
* */
public class 숨어있는숫자의덧셈2 {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[a-zA-Z]+", " ");
        if (str.isBlank()) return 1;    // 숫자 없으면 공백이므로 리턴 1
        String[] arr = str.split(" ");
        for (String item : arr) {
            if (!item.equals(""))
                answer += Integer.parseInt(item);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] test = " ".split(" ");
        System.out.println(Arrays.toString("asdbvasdbsa".replaceAll("[a-zA-Z]+", " ").trim().split(" ")));

    }
}
