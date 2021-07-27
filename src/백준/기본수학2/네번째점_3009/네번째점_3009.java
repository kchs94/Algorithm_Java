package 백준.기본수학2.네번째점_3009;

import java.util.Scanner;

/*
* 세 점이 주어졌을 때 , 축에 평행한 직사각형을 만들기 위해서 필요한 4 번째 점을 찾는 프로그램을 작성하시오.
* 입력: 세 점의 좌표가 한 줄씩 주어진다. 1<=X,Y<=1,000
* 출력: 4번째 점의 좌표를 출력한다.
* 알고리즘:수학
* */
public class 네번째점_3009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] X = new int[4];
        int[] Y = new int[4];

        for(int i=0; i<3; i++){
            X[i] = in.nextInt();
            Y[i] = in.nextInt();
        }
        in.close();
        
        if(X[0] == X[1]) X[3] = X[2];
        else if(X[0] == X[2]) X[3] = X[1];
        else X[3] = X[0];

        if(Y[0] == Y[1]) Y[3] = Y[2];
        else if(Y[0] == Y[2]) Y[3] = Y[1];
        else Y[3] = Y[0];

        System.out.println(X[3] + " " + Y[3]);
    }
}
