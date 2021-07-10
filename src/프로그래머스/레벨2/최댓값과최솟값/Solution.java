package 프로그래머스.레벨2.최댓값과최솟값;

import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int[] intArr = new int[strArr.length];

        // String --> int로 변환
        for(int i=0; i< intArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        // 오름차순으로 정렬
        Arrays.sort(intArr);

        return intArr[0] + " " + intArr[intArr.length-1];
    }
}