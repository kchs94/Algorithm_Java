package 붓캠.알고리즘.중복순열_가위바위보_05;

import java.util.ArrayList;

/*
* 왜 중복 순열인가?
* 왜 중복?: 서로다른 가위, 바위, 보 중 중복해서 선택가능 [바위, 바위, 바위, 바위, 바위]
* 왜 순열?
* 선택o: 가위, 바위, 보 중 하나를 선택해야됨
* 나열o: 각 위치가 서로 다른 사람임, [가위,바위] [바위, 가위]는 다른 것.
* 순열과 조합은 재귀로 풀 수 있다.
* // 전역적으로 반환할 ArrayList<String[]>을 생성합니다.
* 
* */
public class Solution {

  ArrayList<String[]> list = new ArrayList<>();
  public int rounds;
  String[] oneCase;
  String[] rockPaperScissors = {"rock", "paper", "scissors"};
  public void dfs(int rounds) {
    if (this.rounds == rounds) {
      for (int i=0; i<3; i++) {
        oneCase[rounds] = rockPaperScissors[i];
        list.add(oneCase.clone());
      }
    }
    else {
      for (int i=0; i<3; i++) {
        oneCase[rounds] = rockPaperScissors[i];
        dfs(rounds+1);
      }
    }
  }
  public ArrayList<String[]> rockPaperScissors(int rounds) {
    oneCase = new String[rounds];
    this.rounds = rounds-1;
    dfs(0);
    return list;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    for ( String[] arr : solution.rockPaperScissors(2)) {
      for (String str : arr) {
        System.out.print(str + " ");
      }
      System.out.println();
    }
  }
}
