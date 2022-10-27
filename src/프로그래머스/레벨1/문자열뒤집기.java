package 프로그래머스.레벨1;
/*
* 문자열을 뒤집는 메서드는 String에 없고 StringBuilder에 있다.
* */
public class 문자열뒤집기 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string).reverse();
        return sb.toString();
    }
}
