package 프로그래머스.레벨1;
/*
* 문자열 안에 있는 숫자 문자열들을 모두 더한 값을 반환해라
* str.toCharArr로 문자 배열을 만든다음에 Character.isDigit()을 사용해서
* 숫자면 Character.getNumericValue 사용하기
*
* */
public class 숨어있는숫자의덧셈1 {
    public int solution(String my_string) {
        int sum = 0;
        char[] arr = my_string.toCharArray();
        for (char ch : arr) {
            if (Character.isDigit(ch))
                sum += Character.getNumericValue(ch);
        }
        return sum;
    }
}
