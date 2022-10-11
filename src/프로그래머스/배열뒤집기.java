package 프로그래머스;
/*
* 새로운 배열은 생성한 뒤에, 기존 배열의 인덱스를 거꾸로 조회한다.
*
* */
public class 배열뒤집기 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int len = answer.length;
        for (int i=0; i<len; i++) {
            answer[i] = num_list[len-1-i];
        }
        return answer;
    }
}
