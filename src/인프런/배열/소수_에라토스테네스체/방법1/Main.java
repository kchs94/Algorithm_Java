package 인프런.배열.소수_에라토스테네스체.방법1;

import java.util.Scanner;
/*
* 소수: 1과 자신으로만 나누어 지는 수 (=1과 자신외의 값으로는 나누어 지지 않는 수)
*
* */
public class Main {

    public int solution(int n) {
        int count = 0;
        int[] ch = new int[n+1];    // 인덱스 값을 소수인지 검증할 값으로 본다.
        for (int i=2; i<=n; i++) {
            if (ch[i] == 0) {   // 소수이면
                count++;
                for (int j=i ; j<=n; j=j+i) {
                    ch[j] = 1;  // 소수가 아니면 1
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(T.solution(n));
    }
}
