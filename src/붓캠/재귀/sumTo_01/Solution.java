package 붓캠.재귀.sumTo_01;

// 한마디로 재귀를 이용해서 1부터 입력받은 값까지의 합을 구하는 문제
// 재귀함수란 함수 정의 안에 다시 함수의 호출이 등장하는 함수
// 재귀함수는 항상 if(탈출조건) else을 잘 기억하자
// 계속 파고들어가기 때문에 탈출 조건을 작성해줘야 한다.
// 반복해서 숫자를 더해주면 된다. 그럼 언제 더해주는 것을 멈출까? 숫자가 1일 때 탈출하자
public class Solution {
  // 만약 숫자가 0이라면 0을 리턴한다.(예외적 느낌)
  // 그게아니라면 계속 숫자를 더해준다.
  // 만약 숫자가 1이라면 재귀함수를 탈출한다.
  public int sumTo(int num){
    if (num == 0) return 0;
    if (num == 1) return 1;
    else {
      return num + sumTo(num-1);
    }
  }
  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.sumTo(10));
  }
}

