package 프로그래머스.레벨2.나라의숫자.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
* 숫자가 10일때를 잘 생각해야됨
* */
public class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        while(n>0) {
            int remainder = n%3;

            if (remainder == 0) {
                sb.append(4);
                n -= 1;
            }
            else if (remainder == 1) {
                sb.append(1);
            }
            else if (remainder == 2) {
                sb.append(2);
            }

            n /= 3;
        }

        return sb.reverse().toString();
    }

    @Test
    void test() {
        Assertions.assertEquals("1",solution(1));
        Assertions.assertEquals("2",solution(2));
        Assertions.assertEquals("4",solution(3));
        Assertions.assertEquals("11",solution(4));
    }
}
