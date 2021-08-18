package 코드업.문자열;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
* 공백이 있는 문자열을 입력받을 수 있나요? --> StringBuilder readline()
*
* */
public class 문제_1133 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(str);
    }
}
