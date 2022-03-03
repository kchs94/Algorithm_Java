package 백준.단계별문제풀이.정수론및조합론;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class 문제_5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if(num1 == 0 && num2 == 0)
                break;

            if(num2 % num1 == 0){
                System.out.println("factor");
            } else if(num1 % num2 == 0){
                System.out.println("multiple");
            } else
                System.out.println("neither");
        }
    }
}
