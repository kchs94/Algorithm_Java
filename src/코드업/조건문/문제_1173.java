package 코드업.조건문;

import java.util.Scanner;

/*
* 문제:시간을 문자열로 입력하면 30분전의 시간을 출력하는 프로그램
* 예를들어
* 12 34 --> 12 04
*
* [수도 코드]
* 시와 분을 입력받는다.
* if 분 < 30 then
*   if 시간 == 0 then
*        시간을 23로 바꾼다.
*
*   else
*        시간에서 1을 뺀다
*
*   분에서 30을 빼고 60을 더해준다.
*   endif
* else
*   분에서 30을 뺀다.
* endif
* 시와 분을 출력한다.
* */
public class 문제_1173 {
    public static void main(String[] args) {
        // 시와 분을 입력받는다.
        Scanner in = new Scanner(System.in);
        int hours = in.nextInt();
        int minutes = in.nextInt();

        if(minutes < 30){   // if 분 < 30 then

            if(hours == 0)  // if 시간 == 0 then
                hours = 23; //  시간을 23로 바꾼다.
            else
                hours -= 1; // 시간에서 1을 뺀다

            minutes = minutes - 30 + 60;    // 분에서 30을 빼고 60을 더해준다.
        }
        else
            minutes -= 30;  // 분에서 30을 뺀다.

        System.out.println(hours + " " + minutes); // 시와 분을 출력한다.
    }
}
