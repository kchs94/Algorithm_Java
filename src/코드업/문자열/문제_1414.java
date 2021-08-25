package 코드업.문자열;

import java.util.Scanner;

/*
* 출제의도: 문자열 안에 특정 문자열이 몇 개 있는지 구할 수 잇나요?
*
* */
public class 문제_1414 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().toUpperCase();   // 대문자로 변환
        int numOfC = 0;
        int numOfCC = 0;


        for(int i=0; i<str.length(); i++){  // 문자열 길이만큼 반복
            if(str.charAt(i) == 'C'){   // 만약 해당 문자가 일치하면
                numOfC++;   // 증가하고
                if(i != (str.length()-1) && str.charAt(i+1) == 'C') numOfCC++;  // 다음 문자까지 확인
            }
        }

        System.out.println(numOfC);
        System.out.println(numOfCC);
    }
}
