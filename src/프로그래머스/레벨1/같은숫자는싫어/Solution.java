package 프로그래머스.레벨1.같은숫자는싫어;

import java.util.*;

/*
* Solution
* 1.입력으로 들어오는 배열을 앞에서부터 2요소 씩 비교한다. 값이 같으면 패스 다르면 뒤에 있는 값을 넣어준다
* 2.첫 인덱스에 위치한 값은 넣어준다.
* 3.N개의 원소 값 비교시 횟수는 N-1번 하면된다.
* */

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<>();  // 배열의 크기가 변경되기에 ArrayList

        answerList.add(arr[0]); // 첫 요소의 경우 값을 그냥 넣어준다

        for(int i=0; i<arr.length-1; i++){  // 요소 갯수가 N개 일 경우 N-1번 비교한다.
            if(arr[i] == arr[i+1])  // 값이 같으면 변화없이 진행한다.
                continue;
            answerList.add(arr[i+1]);   // 값이 다르면 두 비교 값 중 뒤에 값을 넣어준다.
        }

        int[] answer = new int[answerList.size()];
        for(int i=0; i<answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}