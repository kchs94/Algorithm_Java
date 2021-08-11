package 코드업.출력문;
// 특수문자: 일반적으로 출력되지 않는 문자.
// 특수문자 출력 방법: 백슬레시,따옴표(슬레시, 괄호는 제외)과 같은 특수문자는 특수 문자 앞에 백슬레시(이스케이프 시퀀스)를 붙여야 정상적으로 출력된다.
public class 문제_1103 {
    public static void main(String[] args) {
        System.out.println("\"c:\\test\""); // 특수문자: 따옴표, 백슬레시
    }
}
