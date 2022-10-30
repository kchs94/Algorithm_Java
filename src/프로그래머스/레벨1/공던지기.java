package 프로그래머스.레벨1;
/*
* 원형이므로 n-1 --> 1, n-->2로 던진다라는 조건을 추가한다.
* k번째로 공을 던지는 사람의 번호
* 자꾸 인덱스와 엣지에서 헷갈린다.
* */
public class 공던지기 {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int len = numbers.length;
        int index = 0;
        for (int i=0; i<k-1; i++) {
            if (index == len-1) {
                index = 1;
            }
            else if (index == len-2)
                index = 0;
            else
                index += 2;
        }

        return numbers[index];
    }
}
