package 프로그래머스.레벨1;
/*
* 특정 문자를 ""로 대체하여 없애기
* */
public class 특정문자제거하기 {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}
