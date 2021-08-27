package 코드업.일차원배열;

import java.util.Scanner;

public class 문제_1412 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] arr = new int['z'- 'a' + 1];

        for(int i=0; i<str.length(); i++){  // 문자열 만큼 반복
            if('a'<=str.charAt(i) && str.charAt(i) <= 'z'){ // 문자열안 순차적으로 접근하는 문자가 소문자이면
                arr[str.charAt(i)- 'a']++; // 소문자에 해당하는 인덱스를 가지는 원소값 증가.
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            sb.append((char)('a'+i) + ":" + arr[i] + "\n");
        }

        System.out.print(sb);
    }
}
