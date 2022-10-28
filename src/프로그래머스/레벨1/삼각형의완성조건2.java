package 프로그래머스.레벨1;

import java.util.Arrays;

/*
* 삼각형이 되기위한 조건: 가장 긴 변의 길이 < 다른 두 변의 길이의 합
* 주어진 두 길이 중 하나가 가장 긴 변인 경우
*   될 수 있는 나머지 변의 갯수 : 6 < x + 3, x <= 6     3 < x <= 6  | 11 < x + 7 , x <= 11 --> 4 < x < = 11
* 나머지 한 변이 가장 긴 변인 경우
*   x < 6 + 3, 6 < x --> 6 < x <9
* */
public class 삼각형의완성조건2 {
    public int solution(int[] sides) {

        Arrays.sort(sides);
        int answer = 0;

        // 주어진 두 길이 중 하나가 가장 긴 변인 경우
        answer += sides[1] - (sides[1] - sides[0]);

        // 나머지 한 변이 가장 긴 변인 경우
        answer += sides[0] + sides[1] - sides[1] - 1;
        return answer;
    }
}
