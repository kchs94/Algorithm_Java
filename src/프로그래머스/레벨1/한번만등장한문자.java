package 프로그래머스.레벨1;

public class 한번만등장한문자 {
    public String solution(String s) {
        int[] alpha = new int[26];

        for (char ch : s.toCharArray()) {
            alpha[ch - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<26; i++) {
            if (alpha[i] == 1) sb.append((char)('a' + i));
        }
        return sb.toString();
    }
}
