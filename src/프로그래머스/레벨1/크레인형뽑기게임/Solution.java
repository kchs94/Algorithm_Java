package 프로그래머스.레벨1.크레인형뽑기게임;

// Stack 준비
// stack에 0값 넣기// 왜냐하면 비교할 거기 때문에
// 크레인을 모두 작동시킨 후: 배열 + for문
// for을 이용하여 위의 행부터 접근
// if 아이템이 없으면 행 갯수만큼 아래 칸으로 이동
// else 아이템이 있으면
//      if 아이템 값이 같으면 마지막 넣은 스택 값과 같으면 pop해주고 answer +2
//      else 아이템 값이 다르면 스택에 넣어주고 아이템 위치에 0값 넣기
//      break;

import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);  // 왜냐면 두 값을 비교할 거기 때문에 값이 있어야됨.

        for(int move: moves){   // 크레인 움직인 횟수 만큼 반복
            for(int i=0; i<board.length; i++){  // 행 갯수 만큼 반복
                if(board[i][move-1] == 0)   // 해당 위치의 아이템이 없으면
                    continue;   // 아래 칸으로 이동
                else{   // 해당위치의 아이템이 있으면
                    if(board[i][move-1] == stack.peek()){ // 해당 위치 아이템이 스택 마지막 아이템과 같으면
                        stack.pop();    // 스택 마지막 아이템 없애주고
                        result += 2;    // 사라진 아이템 갯수 2개 추가
                    }
                    else    // 해당 위치의 아이템이 스택 마지막 아이템과 다르면
                        stack.push(board[i][move-1]);   // 아이템 넣어줌
                    board[i][move-1] = 0;   // 공통적으로 아이템은 꺼내주므로
                    break;  // 아이템이 있으면 그만 찾는다.
                }
            }
        }
        return result;
    }
}