package SKT테스트.문제1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/*
* - money보다 작은 화폐 단위 중에서 화폐 단위 대비 생산 단가 비율이 가장 낮은 화폐 단위를 찾는다.
* - 그 화폐 단위로 money를 나눈 몫과 생산 단가를 곱한 값을 정답에 추가한다.
* - 그 화폐 단위로 money를 나머지 연산한 결과를 다시 money에 넣는다.
* - 처음을 다시 반복한다.
* - 만약 money가 0이면 반복을 종료한다.
*
* */
public class Solution {
    public int solution(int money, int[] costs) {
        int answer = 0;
        int[] unit = {1,5,10,50,100,500};
        double[] ratio = new double[6];
        for (int i=0; i<6; i++) {
            ratio[i] = (double) costs[i] / unit[i];
        }

        while(money != 0) {
            double min = Double.MAX_VALUE;
            int temp=1;
            for (int i=0; i<6; i++) {
                if (money >= unit[i] && min > ratio[i]) {
                    min = ratio[i];
                    temp = i;
                }
            }

            answer += (money / unit[temp]) * costs[temp];
            money = money % unit[temp];
        }
        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(2308, solution(4578, new int[]{1,4,99,35,50,1000}));
        Assertions.assertEquals(2798, solution(1999, new int[]{2,11,20,100,200,600}));
    }
}
