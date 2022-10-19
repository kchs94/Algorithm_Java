package 프로그래머스.레벨1;
/*
* 두 2진수를 10진수로 바꾼다
* 두 10진수를 더한다
* 10진수 결과값을 2진수로 바꾼다.
* */
public class 이진수더하기 {
    public String solution(String bin1, String bin2) {
        int a = Integer.parseInt(bin1, 2);
        int b = Integer.parseInt(bin2, 2);

        int result = a + b;
        return Integer.toBinaryString(result);
    }
}
