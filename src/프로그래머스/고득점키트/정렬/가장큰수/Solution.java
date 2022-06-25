package 프로그래머스.고득점키트.정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

/*
* String으로 바꾸어 내림차순으로 정렬하는 문제
* String의 경우 Comparable이 구현되어있으므로 새로운 기준으로 정렬할 때에는 Comparator을 사용한다.
*
* */
public class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i=0; i<arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return (o1+o2).compareTo(o2+o1)*-1;
            }
        });

        if (arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{6,10,2}));
    }
}

