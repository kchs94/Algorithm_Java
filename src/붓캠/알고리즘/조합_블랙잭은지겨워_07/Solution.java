package 붓캠.알고리즘.조합_블랙잭은지겨워_07;

import java.util.Arrays;

/*
* 입력받은 배열에서 3개의 숫자를 뽑는다. --> 조합
* 3개의 뽑혀진 숫자의 합이 소수일 때 ArrayList에 저장한다.
* ArrayList의 사이즈를 반환한다.
* */
public class Solution {
  int answer = 0;
  boolean[] prime;

  private boolean isPrime(int sum) {
    return !prime[sum];
  }

  public void combination(int[] cards, boolean[] visited, int start, int r) {
    if (r == 0) {
      // 구해진 3개가 어떤 숫자인지 알아낸다.
      int sum = 0;
      for (int i=0; i< visited.length; i++) {
        if (visited[i]) sum += cards[i];
      }
      // 3개의 합이 소수인지 아닌지 확인한다.
      if (isPrime(sum)) {
        answer++;
      }
      return;
    }
    for (int i=start; i<cards.length; i++) {
      visited[i] = true;
      combination(cards, visited, i+1, r-1);
      visited[i] = false;
    }
  }

  public int boringBlackjack(int[] cards) {
    boolean[] visited = new boolean[cards.length];
    Arrays.sort(cards);
    int len = cards.length;
    prime = new boolean[cards[len-1] +cards[len-2] + cards[len-3]+1];
    prime[0] = true;
    prime[1] = true;
    for (int i=2; i<=(int)Math.sqrt(prime.length); i++) {
      if (prime[i]) continue;
      for (int j=i*i; j< prime.length; j += i) {
        prime[j] = true;
      }
    }
    combination(cards, visited,0,3);
    return answer;
  }

  public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.boringBlackjack(new int[]{1,2,3,4}));
  }

}
