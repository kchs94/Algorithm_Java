package 프로그래머스.레벨1.문자열내림차순으로배치하기;

// 문자열은 객체를 생성한 후 같은 메모리에서 문자열 변경이 불가능하다. 또한 문자열 단일 문자에 대해서 인덱스 접근도 불가능하다. 따라서 정렬를 하고 싶을 때는 배열로 바꾼다.
// 따라서 문자열을 문자열 배열로 바꾼 뒤 내림차순을 하고 다시 문자열로 바꿔주자.

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] array = s.split("");   // 문자열을 단일 문자로 쪼개기
        Arrays.sort(array); // 오름차순
        Collections.reverse(Arrays.asList(array)); // 배열을 리스트로 바꿔 순서 거꾸로 하기
        return String.join("", array); //배열을 string으로 변환




    }
}