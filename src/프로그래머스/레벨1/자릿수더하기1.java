package 프로그래머스.레벨1;
/*
* 숫자가 입력으로 주어질 때 각 자릿수 숫자를 더한 값을 반환해라
* 숫자 n을 10으로 나눈 값 몫
*
* */
public class 자릿수더하기1 {
    public int solution(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n%10;    // 나머지
            n = n/10;   // 몫
        }
        return sum;
    }
}
