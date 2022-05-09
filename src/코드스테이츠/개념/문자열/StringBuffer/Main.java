package 코드스테이츠.개념.문자열.StringBuffer;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java");
        System.out.println("문자열: " + sb);
        System.out.println(sb.append(" programming"));
        System.out.println("append() 메소드 호출 후: " + sb);

        StringBuffer str01 = new StringBuffer();
        StringBuffer str02 = new StringBuffer("java");
        System.out.println(str01.capacity());
        System.out.println(str02.capacity());

        StringBuffer str = new StringBuffer("Java Oracle");
    }
}
