package 백준.IF문;

import java.util.Scanner;

public class 알람시계_2884 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();       //시간 입력
        int M = in.nextInt();       //분 입력

        in.close();

        if(45 <= M) System.out.print(H + " " + (M-45)); //45분 이상일 때는 M에서만 -45
        else{   //45분 미만일 때
            if(H == 0) H=23;    //시간이 0시일 경우 H를 23으로 바꾼다
            else H -=1; //시간이 0시가 아닐 경우 H에서 -1하고 M에서 -45
            M=M-45+60;
            System.out.println(H + " " + M);
        }
    }
}
