package 프로그래머스.레벨1;

import java.util.Arrays;

/*
* 어떤 배열의  부분 배열을 구해야 되니깐 Arrays.copyOfRange()를 사용하면 된다.
* copyOfRange에서 3번째 인자에 들어가는 인덱스는 원소에 포함되지 않으니 주의한다.
* */
public class 배열자르기 {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}
