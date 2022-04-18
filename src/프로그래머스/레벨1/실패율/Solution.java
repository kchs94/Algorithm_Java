package 프로그래머스.레벨1.실패율;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

/*
* 실패율을 구해라
* 실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
*
* 1. 각 스테이지 별로 스테이지에 도달했으나 아직 클리어하지 못한 플레이어 수와 스테이지에 도달한 플레이어 수를 구한다.
* 2. 구한 값을 나누어 실패율을 구한다.(스테이지에 도달한 유저가 없을 경우 실패율은 0이다)
* 3. 정렬하여 stage 번호를 answer에 담는다.
*
* */
public class Solution {

    static class Stage {
        int num;    // 스테이지 넘버
        double failRate;   // 실패율

        public Stage(int num, double failRate) {
            this.num = num;
            this.failRate = failRate;
        }
    }

    public static int[] solution(int N, int[] stages) {

        int[] numOfNotClearPlayer = new int[N+2];   //
        int[] numOfAllPlayer = new int[N+2];

        // 각 스테이지에 머물러 있는 user 수 구하기
        for (int i=0; i<stages.length; i++) {
            numOfNotClearPlayer[stages[i]]++;
        }

        // 스테이지에 도달한 플레이어 수 구하기
        numOfAllPlayer[N] = numOfNotClearPlayer[N] + numOfNotClearPlayer[N+1];
        for (int i=N-1; i>=1; i--) {
            numOfAllPlayer[i] = numOfNotClearPlayer[i] + numOfAllPlayer[i+1];
        }

        // 각 스테이지 별 실패율 구하기
        ArrayList<Stage> list = new ArrayList<>();
        for (int i=1; i<=N; i++) {

            if (numOfAllPlayer[i] == 0) {
                list.add(new Stage(i,0));
                continue;
            }

            double failRate = (double) numOfNotClearPlayer[i] / numOfAllPlayer[i];
            list.add(new Stage(i,failRate));
        }

        // 실패율을 기준으로 내림차순한다. 만약 실패율이 같으면 스테이지 단계를 기준으로 오름차순한다.
        Collections.sort(list, (o1, o2) -> {
            if (o1.failRate == o2.failRate)
                return o1.num - o2.num;

            return Double.compare(o2.failRate, o1.failRate);
        });

        // 정답 담기
        int[] answer = new int[N];
        for (int i=0; i<N; i++) {
            answer[i] = list.get(i).num;
        }

        return answer;
    }

    @Test
    public void test() {
        Assertions.assertArrayEquals(new int[]{3,4,2,1,5}, solution(5, new int[]{2,1,2,6,2,4,3,3}));
        Assertions.assertArrayEquals(new int[]{4,1,2,3}, solution(4, new int[]{4,4,4,4,4}));
    }
}
