package 프로그래머스.레벨1;
/*
* 가장 가까운 수를 찾으려면 각 원소에 접근해서 절댓값이 최소인 원소 값을 구하면 된다.
* 만약 가까운 수가 여러 개면 더 작은 수를 선택한다.
* */
public class 가까운수 {
    public int solution(int[] array, int n) {
        int minGap = Integer.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i=0; i<array.length; i++) {
            int currentGap = Math.abs(n - array[i]);
            if (minGap > currentGap) {
                minGap = Math.abs((n - array[i]));
                minValue = array[i];
            } else if (minGap == currentGap) {
                if (minValue > array[i])
                    minValue = array[i];
            }
        }

        return minValue;
    }
}
