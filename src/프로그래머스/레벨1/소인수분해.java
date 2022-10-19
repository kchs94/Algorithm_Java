package 프로그래머스.레벨1;

import java.util.ArrayList;

public class 소인수분해 {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            if (n%i == 0 && isPrime(i))
                list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i=2; i<num; i++) {
            if (num%i == 0)
                return false;
        }
        return true;
    }
}
