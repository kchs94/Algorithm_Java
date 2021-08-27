package 코드업.문자열;

/*
* 문장이 입력되면 "love"가 몇 번 나오는지 알 수 있나요?
* */

import java.util.Scanner;

public class 문제_1419 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        int index=0;
        int count=0;
        while(true){

            if(str.indexOf("love", index) != -1){
                index = str.indexOf("love",index)+4;
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}
