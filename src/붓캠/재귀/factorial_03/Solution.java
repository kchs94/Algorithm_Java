package 붓캠.재귀.factorial_03;

// 재귀에서 너무 유명한 팩토리얼 문제
// n 팩토리얼은 1부터 n까지의 수를 곱한 값과 같다.
// 재귀는 늘 if(탈출조건) - else 구조를 생각한다
// f(n) = f(1)*f(2)*...*f(n)
// f(0)이 1로 정의되므로 n값이 0일 때를 탈출 조건으로 한다.
// 만약 num이 0이라면 1을 반환한다.
// 그게아니라면 계속 수를 곱한다.
// 느낀점: 0을 때를 주의해서 보자
public class Solution {
  public int factorial(int num){
    if (num == 0) return 1;
    else {
      return num * factorial(num-1);
    }
  }
}
