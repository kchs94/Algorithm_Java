package 코드업.함수;

public class 문제_1532 {
    public static long printMinInteger(){
        return -2147483649L;    // integer 범위를 벗어나므로 L을 붙여 long형으로 한다.
    }

    public static void main(String[] args) {
        System.out.println(printMinInteger());
    }
}
