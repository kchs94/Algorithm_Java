package 붓캠.데일리;

import org.junit.jupiter.api.Test;
// 수를 입력받아 2의 거듭제곱인지 확인하는 문제
// 1, 2, 4, 8, 16, 32, ...
// 1 -> 몫0, 나머지1
// 5 -> 몫2, 나머지1 -> 몫1, 나머지0 -> 몫0 나머지1
// 6 -> 몫3, 나머지0 -> 몫1, 나머지1 -> 몫0 나머지1
// 8 -> 몫4, 나머지0 -> 몫2, 나머지0 -> 몫1 나머지 0 -> 몫0, 나머지1
// 0이 아닐때까지 계속 나눈다.
// 그리고 만약 나머지가 1이라면 바로 false
// 0이면 탈출
public class PowerOfTwo_02 {
  public boolean powerOfTwo(long num) {
    boolean answer = true;

    while(num != 0) {
      long remainder = num%2;
      if (remainder == 1) return false;
      num /= 2;
    }

    return answer;
  }
}
