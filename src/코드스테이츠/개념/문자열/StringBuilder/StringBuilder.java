package 코드스테이츠.개념.문자열.StringBuilder;

import java.util.StringTokenizer;

public class StringBuilder {
    public static void main(String[] args) {
        String str = "This is a string example using StringTokenizer";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(str);
        System.out.println();

        System.out.println("total tokens: " + st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println("total token: " + st.countTokens());

    }
}
