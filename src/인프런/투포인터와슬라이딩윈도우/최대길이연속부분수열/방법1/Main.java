package 인프런.투포인터와슬라이딩윈도우.최대길이연속부분수열.방법1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main {
    public int solution(int N, int k, int[] arr) {
        int answer=0;
        int count = 0;
        int start=0;

        for (int end = 0; end<N; end++) {
            if (arr[end] == 0) count++; // 만약 원소가 0이라면 count를 증가시킨다.
            while (count > k) { // count가 k를 넘어가면 start 포인터가 0을 만날 때까지 오른쪽으로 이동시킨다.
                if (arr[start] == 0) count--;
                start++;
            }
            answer = Math.max(answer, end - start + 1); // 부분 수열의 길이를 구한다.
        }
        return answer;
    }

    @Test
    void test() {
        Assertions.assertEquals(8, solution(14, 2, new int[]{1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1}));
    }
}
