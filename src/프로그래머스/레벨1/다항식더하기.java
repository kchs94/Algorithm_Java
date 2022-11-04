package 프로그래머스.레벨1;
/*
* [3x, +, 7, + , x]
* int xCount
* int numCount
* char operator
*
* // 변수, 연산자 +, 숫자
* // 연산자 인가요?
* // 숫자 인가요?
* // 변수인가요?
*
* */
public class 다항식더하기 {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" ");
        int xCount = 0;
        int numCount = 0;
        char operator;

        for (int i=0; i<arr.length; i++) {
            if (arr[i].matches("^\\d*x$")) {
                if (arr[i].length() == 1)
                    xCount += 1;
                else
                    xCount += Integer.parseInt(arr[i].substring(0, arr[i].length()-1));
            } else if (arr[i].matches("\\+")) {

            } else {
                numCount += Integer.parseInt(arr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (xCount != 0) {
            if (xCount != 1) {
                sb.append(xCount);
            }
            sb.append("x");
        }


        if (numCount != 0) {
            if (xCount != 0)
                sb.append(" + ");
            sb.append(numCount);
        }

        if (xCount == 0 && numCount == 0)
            sb.append("0");
        return sb.toString();
    }
}
