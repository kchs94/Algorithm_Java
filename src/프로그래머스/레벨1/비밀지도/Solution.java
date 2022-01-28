package 프로그래머스.레벨1.비밀지도;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/*
* 길이 n을 받아서 길이가 n인 2차원 문자열 배열을 선언한다.
*
* */
public class Solution {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] temp_arr1 = new String[n]; // arr1의 문자열 이진법을 담을 배열
        String[] temp_arr2 = new String[n]; // arr2의 문자열 이진법을 담을 배열

        for (int i=0; i<n; i++) {   // 비밀 지도의 크기만큼 반복
            temp_arr1[i] = Integer.toBinaryString(arr1[i]); // 십진법을 이진법으로 바꾼다.
            temp_arr2[i] = Integer.toBinaryString(arr2[i]); // 십진법을 이진법으로 바꾼다.

            while (temp_arr1[i].length() != n) {    // 만약 이진법의 길이가 n이 아니라면 앞에 0을 채워준다
                temp_arr1[i] = "0" + temp_arr1[i];
            }
            while (temp_arr2[i].length() != n) {    // 만약 이진법의 길이가 n이 아니라면 앞에 0을 채워준다
                temp_arr2[i] = "0" + temp_arr2[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {   // 가로

            for (int j=0; j<n; j++) {   // 세로
                if (temp_arr1[i].charAt(j) == '1' || temp_arr2[i].charAt(j) == '1') {   // 해당 위치에 두 지도 중 하나라도 벽이 있다면 벽이니깐
                    sb.append('#');
                }
                else {  // 두 지도 모두 벽(1)이 아니면 공백이니깐
                    sb.append(' ');
                }
            }
            answer[i] = sb.toString();
            sb = new StringBuilder();   // sb를 새로운 객체로 셋팅
        }
        return answer;
    }


    @Test
    void test() {
        // 두 배열의 값이 같은지 확인한다
        Assertions.assertArrayEquals(new String[]{"#####", "# # #", "### #", "#  ##", "#####"},
                solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
    }
}
