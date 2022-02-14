package 프로그래머스.레벨2.N개의최소공배수.첫풀이;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
* a, b의 최소 공배수 =  a * b / 최대 공약수
* a, b,c의 최소 공배수 = a,b의 최소 공배수 * b /
* */
public class Solution {
    public int solution(int[] arr) {
        int answer = 1;

        for (int i=0; i<arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }

    // 최대공약수 공식
    static int gcd(int a, int b) {
        while(b !=0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }

    // 최소공배수 공식
    static int lcm(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        return a * b / gcd(a, b);
    }

    @Test
    void test() {
        Assertions.assertEquals(168, solution(new int[]{2, 6, 8, 14}));
        Assertions.assertEquals(6, solution(new int[]{1, 2, 3}));
    }
}
