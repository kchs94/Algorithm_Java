package 프로그래머스.레벨1;

// solution
// 1.ArrayList를 생성해 나누어 지면(=나머지연산) 추가하기
// 2.만약 나누어 떨어지는게 없다면 리턴 값은 -1
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0)   // 나누어 떨어지면
                answerList.add(arr[i]);
        }

        int [] answer;
        if(answerList.size() != 0){
            answer = new int[answerList.size()];
            for(int i=0; i<answer.length; i++)
                answer[i] = answerList.get(i);
            Arrays.sort(answer);
        }
        else{
            answer = new int[1];
            answer[0] = -1;
        }
        return answer;
    }
}
