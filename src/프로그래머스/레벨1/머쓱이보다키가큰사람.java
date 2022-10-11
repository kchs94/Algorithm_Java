package 프로그래머스.레벨1;

import java.util.Arrays;
import java.util.Collections;

/*
* 키가 큰 사람순으로 배열 내림차순 정렬
* 키가 큰 사람이라면 +1
* 키가 작거나 같은 사람이라면 break;
* */
public class 머쓱이보다키가큰사람 {
    public int solution(int[] array, int height) {
        int answer = 0;
        Integer[] arr = new Integer[array.length];

        for (int i=0; i<arr.length; i++) {
            arr[i] = Integer.valueOf(array[i]);
        }

        Arrays.sort(arr, Collections.reverseOrder());// 오름차순으로 정렬

        for (int i : arr ) {
            if (i > height)
                answer++;
            else break;
        }
        return answer;
    }
}
