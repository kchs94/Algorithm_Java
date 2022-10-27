package 프로그래머스.레벨1;

public class 문자열안에문자열 {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
