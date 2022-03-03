package 백준.단계별문제풀이.문자열;

import java.util.Scanner;

/*
* url:https://www.acmicpc.net/problem/11720
* 문제: N개의 숫자가 공백없이 나열되어있습니다. 이 숫자들의 합을 출력하세요.
* 입력: 첫째 줄에 숫자의 갯수 N(1<=N<=100)이 주어지고 둘째 줄에 N개의 숫자가 공백없이 입력됩니다.
* 출력: 입력으로 주어진 나열된 숫자의 합을 출력하세요.
* */
public class 숫자의합_11720 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();   // N 입력
        
        // 문자열로 입력받아 바로 쪼개 String[]에 저장
        String[] strArr = in.next().split("");
        in.close();
        int[] intArr = new int[strArr.length];

        int sum=0;
        //String[] --> int[]로 옮기기
        for(int i=0; i<intArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
            sum += intArr[i];
        }
        System.out.println(sum);
    }
}
