package 프로그래머스.레벨1;

public class 저주의숫자3 {
    public int solution(int n) {
        int num = 0;

        for (int i=1; i<=n; i++) {
            num++;

            while (havingThree(num) || num%3 == 0) {
                num++;
            }
        }

        return num;
    }
    public static boolean havingThree(int num) {
        return String.valueOf(num).contains("3");
    }
}
