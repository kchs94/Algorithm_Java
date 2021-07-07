package 프로그래머스.레벨1.두개뽑아서더하기;

// result는 길이를 모르니 ArrayList<Integer>

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++){  // 전체 훑기
            for(int j=i+1; j<numbers.length; j++){
                if(arrList.contains(numbers[i] + numbers[j]) != true)   // 구한 값이 없다면 넣어준다
                    arrList.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[arrList.size()]; // 배열에 다시 넣어준다.
        for(int i=0; i<arrList.size(); i++){
            answer[i] = arrList.get(i);
        }
        Arrays.sort(answer);


        return answer;
    }
}