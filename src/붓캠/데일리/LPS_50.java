package 붓캠.데일리;
/*
* LPS 조건
* - a인덱스 문자와 대칭인 b인덱스 문자가 같다.
* - 이전 문자와 같다.
*
* */
public class LPS_50 {
    public int LPS(String str) {
        int len = str.length();

        int i=0;
        int count = 0;
        while (i < len-(i+1)) {    // 0 != 3, 1 != 2 2 != 1
            if (str.charAt(i) != str.charAt(len-(i+1))) break;
            if (i>=1 && str.charAt(i) != str.charAt(i-1)) break;
            count++;
            i++;
        }

        return count;
    }

    public static void main(String[] args) {
        LPS_50 sol = new LPS_50();
        System.out.println(sol.LPS("aaaaa"));
    }
}
