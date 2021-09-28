package 코드업.함수;

import java.util.Scanner;

public class odd또는even출력_1538 {

    public static void f(int n){
        System.out.printf("%s\n", n%2==0 ? "even" : "odd");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        f(in.nextInt());
    }
}
