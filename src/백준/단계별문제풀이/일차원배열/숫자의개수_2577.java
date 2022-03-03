package 백준.단계별문제풀이.일차원배열;

import java.util.Scanner;

public class 숫자의개수_2577 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int value = (in.nextInt() * in.nextInt() * in.nextInt()); // 굳이 변수를 선언하여 저장 할 필요가 없는 형태
        String str = String.valueOf(value);   // 각 자리수 마다 접근할 예정이므로 String으로 형 변환
        in.close();

        for(int i=0; i<10; i++){
            int count = 0 ;
            for(int j=0; j<str.length();j++){
                if((str.charAt(j) - '0') == i){
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
}
