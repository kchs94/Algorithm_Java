package 프로그래머스.레벨1;
/*
* String을 반복해서 더하면 메모리가 낭비되므로 StringBuilder를 사용한다.
* */
public class 문자반복출력하기 {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<my_string.length(); i++) {
            for (int j=0; j<n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}
