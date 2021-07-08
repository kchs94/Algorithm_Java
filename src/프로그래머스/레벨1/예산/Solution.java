package 프로그래머스.레벨1.예산;

// 최대 몇 개의 부서에 물품을 지원할 수 있는지 알려면
// 부서가 신청한 금액이 작은 부서부터 지원을 해야 한다.
// 그렇기 때문에 배열을 정렬하는게 좋다.
// 각 부서에는 정확히 신청한 금액 만큼 지원해야 하고 적은 금액은 지원불가.
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int count = 0;  // 지원할 수 있는 부서의 수

        Arrays.sort(d); // 오름차순으로 신청 예산 정렬

        for(int i=0; i<d.length; i++){  // 예산이 작은 부서부터
            if(budget - d[i] >= 0){     // 지원 후 예산이 남아있으면
                budget -= d[i];
                count++;
            }
            else    // 예산이 남아있지 않을 때
                break;
        }
        return count;
    }
}