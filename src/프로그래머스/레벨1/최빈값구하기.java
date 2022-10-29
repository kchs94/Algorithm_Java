package 프로그래머스.레벨1;
/*
* 최빈값은 주어진 값 중 가장 자주 나오는 값을 의미한다.
* 정수 배열이 입력으로 주어질 때 최빈값을 return 해라.
* 단 최빈값이 여러 개면 -1을 리턴한다.
*
* 6 6 8
* - 한 번을 순회해야 최빈값을 알 수 있다.
* - a[0] = 3, a[1] = 6, a[2] = 5 ...
* */
public class 최빈값구하기 {
    public int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[1000];

        for (int i : array) {
            arr[i]++;
        }

        int max = Integer.MIN_VALUE;
        //
        for (int i=0; i<1000; i++) {
            if (max < arr[i]) {
                max = arr[i];
                answer = i;
            }
        }

        for (int i=0; i<1000; i++) {
            if (max == arr[i]) {
                if (answer != i) {
                    answer = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
