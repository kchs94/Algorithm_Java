package 인프런.문자열.문장속단어;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String[] words = str.split(" ");

        int index = -1;
        int max= -1;
        for(int i=0; i< words.length; i++) {
            if(max < words[i].length()){
                max = words[i].length();
                index = i;
            }
        }

        return words[index];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(T.solution(str));
    }
}
