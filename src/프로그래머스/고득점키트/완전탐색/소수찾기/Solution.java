package 프로그래머스.고득점키트.완전탐색.소수찾기;

import java.util.HashSet;

/*
* 1.문자열을 이용하여 가능한 모든 조합을 구한다.
* 2.중복이 있으므로 SET에 저장한다.
* 3.여러 조합 중 소수를 찾는다.
* */
public class Solution {
    HashSet<Integer> numberSet = new HashSet<>();
    HashSet<Integer> numberSet1 = new HashSet<>();
    public boolean isPrime(int num) {
        // 1. 0,1은 소수가 아니다.
        if (num == 0 || num == 1) return false;

        // 에토스테네스 채
        for (int i=2; i<=(int)Math.sqrt(num); i++) {
            if (num%i == 0) return false;
        }

        return true;
    }

    public boolean isPrime2(int num) {
        // 1. 0, 1은 소수가 아니다.
        if(num == 0 || num == 1) return false;

        // 에토스테네스 체
        for (int i=2; i<(int)Math.sqrt(num); i++) {
            if (num%i == 0) return false;
        }

        return true;
    }

    public void recursive(String comb, String others) {
        // 1. 현재 조합을 set에 추가한다.
        if (!comb.equals(""))
            numberSet.add(Integer.valueOf(comb));

        // 2. 남은 숫자중 한 개를 더해 새로운 조합을 만든다.
        for (int i=0; i<others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }

    public void recursive1(String comb, String others) {
        if (!comb.equals(""))
            numberSet1.add(Integer.valueOf(comb));

        for (int i=0; i<others.length(); i++) {
            recursive1(comb + others.charAt(i), others.substring(0, i) + others.substring(i+1));
        }
    }

    public int solution(String numbers) {
        // 1. 모든 조합의 숫자를 만든다
        recursive("",numbers);

        System.out.println(numberSet);
        // 2. 소수의 갯수만 샌다
        int count = 0;
        for (Integer i : numberSet) {
            if (isPrime(i)) count++;
        }

        // 3. 소수의 갯수를 반환한다.
        return count;
    }

    public int solution1(String numbers) {
        // 1. 모든 조합의 숫자를 만든다.
        recursive("", numbers);
        System.out.println(numberSet1);

        // 2.소수의 갯수만 샌다
        int count = 0;
        for (Integer i : numberSet1) {
            if (isPrime(i)) count++;
        }

        // 3. 소수의 갯수를 반환한다.
        return count;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("17"));
    }
}
