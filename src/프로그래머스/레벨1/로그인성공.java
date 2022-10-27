package 프로그래머스.레벨1;
/*
*
* */
public class 로그인성공 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        for (String[] arr : db) {
            if (id_pw[0].equals(arr[0]) && id_pw[1].equals(arr[1])) return "login";

            if (id_pw[0].equals(arr[0])) return "wrong pw";
        }
        return "fail";
    }
}
