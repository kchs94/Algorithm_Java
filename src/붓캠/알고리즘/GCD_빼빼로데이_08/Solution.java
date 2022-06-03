package 붓캠.알고리즘.GCD_빼빼로데이_08;
import java.math.BigInteger;
import java.util.*;
// 직원1 아몬드4 누드 8
// 직원2 아몬드2 누드 4
// 직원4 아몬드1 누드 2
// 4,8
// gcd: 4
// 1,2,4
// 최대공약수 : a,b 공통 약수 중 최대값

public class Solution {
  public ArrayList<Integer[]> divideChocolateStick(int M, int N) {
    // M,N의 최대 공약수 GCD를 구한다.
    // GCD의 약수 집합을 구한다.
    // 각 약수값을 직원 수로하는 경우를 더한다.
    BigInteger amond = new BigInteger(String.valueOf(M));
    BigInteger nude = new BigInteger(String.valueOf(N));
    int gcd =  amond.gcd(nude).intValue();

    ArrayList<Integer[]> list = new ArrayList<>();
    for (int i=1; i<=gcd; i++) {
      if (gcd%i == 0) {
        list.add(new Integer[]{i,M/i,N/i});
      }
    }
    return list;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.divideChocolateStick(8, 10));
  }
}

