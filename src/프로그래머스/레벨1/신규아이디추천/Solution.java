package 프로그래머스.레벨1.신규아이디추천;

public class Solution {
    public String solution(String new_id) {
        String answer = "";
        String temp = new_id.toLowerCase(); //1

        // 2. '-', '_', '.', 알파벳소문자, 숫자를 제외한 문자는 제거한다.
        temp = temp.replaceAll("[^-_.a-z0-9]", "");

        // 3.'.'이 2번이상 연속되는 경우 모두 '.'로 바꾼다.
        temp = temp.replaceAll("[.]{2,}", ".");

        // 4.문자열의 처음과 끝에 '.'이 있으면 제거한다.
        temp = temp.replaceAll("^[.]|[.]$", "");

        // 5.만약 문자열이 공백이라면 "a"를 추가한다.
        if (temp.equals(""))
            temp += "a";

        // 6.만약 문자열 길이가 16이상이라면 앞에서부터 15문자만 남긴다. 그리고 남긴 문자열 처음과 끝이 '.'이면 제거한다.
        if (temp.length() >= 16) {
            temp = temp.substring(0, 15);
            temp = temp.replaceAll("^[.]|[.]$", "");
        }

        // 7. 만약 문자열 길이가 2이하라면 길이가 3이 될 때까지 문자열 마지막 문자를 추가해준다.
        if (temp.length() <= 2)
            while(temp.length()<3)
                temp += temp.charAt(temp.length()-1);

        answer = temp;
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution.solution("z-+.^."));
        System.out.println(solution.solution("=.="));
        System.out.println(solution.solution("123_.def"));
        System.out.println(solution.solution("abcdefghijklmn.p"));
    }
}
