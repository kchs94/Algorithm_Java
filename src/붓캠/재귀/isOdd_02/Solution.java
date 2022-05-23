package 붓캠.재귀.isOdd_02;
// 재귀함수를 이용해서 입력받은 숫자가 홀수인지 판단하는 문제
// if(조건문) else
// 입력값이 음수일수도 있으므로 java.lang.Math#abs()로 절댓값으로 만든다.(주의하자)
// 만약 값이 1이라면 짝수이므로 True를 리턴한다.
// 만약 값이 0이라면 홀수이므로 False를 리턴한다.
// 그게 아니라면 -2씩 계속 값을 줄인다.
public class Solution {
  public boolean isOdd(int num) {
    num = Math.abs(num);
    if (num == 1) return true;
    else if (num == 0) return false;
    else {
      return isOdd(num-2);
    }
  }
}
