package 프로그래머스.레벨1;

import java.util.Arrays;
import java.util.Comparator;

/*
* n과 가까운 수부터 정렬하기
* 단 거리가 같다면 큰 수 먼저 온다.
* 기본 자료형 정렬이니깐 Comparator 이용하기
*
* */
public class 특이한정렬 {
    public int[] solution(int[] numlist, int n) {
        Integer[] integers = Arrays.stream(numlist).boxed().toArray(Integer[]::new);

        Arrays.sort(integers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1-n) == Math.abs(o2-n))
                    return (o1-o2)*-1;

               return Math.abs(o1-n) - Math.abs(o2-n);    // 더 가까운 놈들
            }
        });

        return Arrays.stream(integers).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        특이한정렬 sol = new 특이한정렬();
        System.out.println(Arrays.toString(sol.solution(new int[]{1,2,3,4,5,6}, 4)));
    }
}
