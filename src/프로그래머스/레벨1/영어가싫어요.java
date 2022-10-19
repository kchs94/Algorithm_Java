package 프로그래머스.레벨1;
/*
* 배열을 이용해서 value와 인덱스 맵핑하기
*
* */
public class 영어가싫어요 {
    public long solution(String numbers) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i=0; i<arr.length; i++) {
            numbers = numbers.replace(arr[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}
