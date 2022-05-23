package 붓캠.재귀.fibonacci_04;

// 수(num)를 입력받으면 피보나치 수열의 num번째 요소의 값을 구하는 문제다.
// 피보나치 수열은 재귀에서 유명한 문제 중 하나다.
// 피보나치 수열에서 현재 원소의 값은 두 원소의 합과 같다.
// f(n) = f(n-2) + f(n-1) (단 n>2일 경우 성립. f(0),f(1)가 탈출조건이 된다)
// 마찬가지로 if-else 구조로 문제를 푼다.
// 만약 0번째라면 0을 반환한다.
// 만약 1번째라면 1을 반환한다.
// 그 외라면 바로 앞 두 요소의 합을 반환한다.
public class Solution {
  public int fibonacci(int num){
    if (num == 0) return 0;
    else if(num == 1) return 1;
    else return fibonacci(num-2) + fibonacci(num-1);
  }
}
