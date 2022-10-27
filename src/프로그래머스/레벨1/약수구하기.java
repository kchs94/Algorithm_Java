package 프로그래머스.레벨1;

import java.util.ArrayList;
/*
* 약수: 나누어 떨어지는 수
* 갯수를 모르니 list를 사용한다.
* */
public class 약수구하기 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            if (n%i == 0)
                list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
