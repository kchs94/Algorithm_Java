package 백준.분할정복;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
/*
* 순열 nPr: 서로다른 n개에서 r개를 선택하여 순서있게 일렬로 나열하는 모든 경우의 수
* 조합 nCr: 서로다룬 n개에서 r개를 선택하는 모든 경우의 수
*
* */
public class 이항계수3_11401 {
    public static void main(String[] args) {
        System.out.println(combination(4_000_000,5));
    }

    public static int combination(int n, int r) {
        if(n == r || r == 0)
            return 1;
        else
            return combination(n-1, r) + combination(n-1, r-1);
    }
}
