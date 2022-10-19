package 프로그래머스.레벨1;

import java.util.Arrays;
/*
* 배열 초깃값을 모두 1로 만든다.
* 완전 탐색을 해서 값이 작은 경우 1씩 증가시켜준다
* */
public class 진료순서정하기 {
    public int[] solution(int[] emergency) {
        int len = emergency.length;
        int[] answer = new int[len];
        Arrays.fill(answer, 1);

        for (int i=0; i< len-1; i++) {
            for (int j=i+1; j<len; j++) {
                if (emergency[i] < emergency[j])
                    answer[i]++;
                else
                    answer[j]++;
            }
        }
        return answer;
    }
}
