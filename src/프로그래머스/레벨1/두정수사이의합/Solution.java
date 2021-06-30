package 프로그래머스.레벨1.두정수사이의합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
//       첫번 째 문제 풀이 - 직관적
//         if(a>b){
//             int temp = a;
//             a = b;
//             b = temp;
//         }

//         for(int i=a; i<=b; i++)
//             answer += i;
        // 두번 째 문제 풀이 - 수학 이용

        a = Math.min(a, b);
        b = Math.max(a, b);

        // 등차수열: (초 항 + 마지막 항) * 항의 갯수 / 2
        answer = (((long)(b - a + 1) * (a + b))) / 2; // 곱할 때 오버플로우 발생

        return answer;
    }
}