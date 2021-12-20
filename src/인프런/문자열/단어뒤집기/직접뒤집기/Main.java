package 인프런.문자열.단어뒤집기.직접뒤집기;
/**/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str) {
            char[] s = x.toCharArray();
            int lI= 0;
            int rI = x.length()-1;

            while(lI < rI) {
                char temp = s[lI];
                s[lI] = s[rI];
                s[rI] = temp;
                lI++;
                rI--;
            }
            String result = String.valueOf(s);
            answer.add(result);
        }
        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++) {
            str[i] = in.next();
        }
        for(String x : T.solution(n, str)) {
            System.out.println(x);
        }
    }
}
