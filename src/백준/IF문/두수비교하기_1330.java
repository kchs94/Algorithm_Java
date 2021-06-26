package 백준.IF문;

import java.util.Scanner;

public class 두수비교하기_1330 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        in.close();

        if(A>B)     // A가 더 클 때
            System.out.println(">");
        else if(A<B)    //B가 더 클 때
            System.out.println("<");
        else        //값이 같을 때
            System.out.println("==");
    }
}
