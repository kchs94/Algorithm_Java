package 프로그래머스.레벨1;

import org.junit.jupiter.api.Test;


/*
* 합성수란 약수의 갯수가 3개 이상인 수
* 합성수인지 판별해주는 함수를 만든다
* 1부터 n까지 반복하면서 합성수이면 answer++
* */
public class 합성수찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i=1; i<=n; i++) {
            if (isComposite(i)) answer++;
        }
        return answer;
    }

    public static boolean isComposite(int num) {
        int count = 0;
        for (int i=1; i<=num; i++) {
            if (num%i == 0) count++;
        }
        return (count >= 3) ? true : false;
    }

    @Test
    void test() {
        합성수찾기 sol = new 합성수찾기();
    }
}
