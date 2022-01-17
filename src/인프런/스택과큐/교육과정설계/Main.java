package 인프런.스택과큐.교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public String solution(String str1, String str2) {
        String answer = "YES";

        Queue<Character> q = new LinkedList<>();

        for (char ch : str1.toCharArray()) {
            q.offer(ch);
        }

        for (char ch : str2.toCharArray()) {
            if (q.contains(ch)) {
                if (ch != q.poll()) return "NO";
            }
        }
        if (!q.isEmpty())
            return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        System.out.println(T.solution(str1, str2));
    }
}
