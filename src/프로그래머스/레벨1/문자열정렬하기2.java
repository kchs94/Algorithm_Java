package 프로그래머스.레벨1;

import java.util.Arrays;

/*
* 자바에서 하나의 문자열은 변경이 불가능 하기 때문에 정렬 메서드가 없다.
* 따라서 문자 배열로 만든다음에 정렬을 해야한다.
* - 배운것
* String 생성자로 char[]을 인자로 주면 문자열을 만들어 준다.
* */
public class 문자열정렬하기2 {

    public String solution(String my_string) {

        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);

        return new String(arr);
    }
}
