package 프로그래머스.레벨1.정수내림차순으로배치하기;
// long을 배열로 바꿔준다.
// 배열을 오름차순으로 정렬한다.
// StringBuffer로 배열을 역순으로 접근하여 문자열을 붙인다
// 문자열을 long으로 바꿔준다.
import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String temp = String.valueOf(n);        //long을 String으로 형 변환
        int[] arr = new int[temp.length()];     //int[] 형 배열 선언
        for(int i=0; i<temp.length(); i++){     // 배열에 각 자리 값 담기
            arr[i] = temp.charAt(i) - '0';
        }
        Arrays.sort(arr);   // 오름차순 정렬

        StringBuffer sb = new StringBuffer();
        for(int i=0; i<arr.length; i++){    // 역순으로 문자열을 붙여간다.
            sb.append(arr[arr.length-(i+1)]);
        }

        answer = Long.parseLong(sb.toString()); // 문자열을 Long 형으로 바꾼다.

        return answer;
    }
}