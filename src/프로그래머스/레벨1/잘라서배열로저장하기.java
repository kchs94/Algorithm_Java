package 프로그래머스.레벨1;
/*
* 문자열을 특정 길이만큼 잘라서 배열에 저장해서 반환하는 문제
* "12345" 길이2 5/2 몫=2 나머지 1,
* "1234"  길이4 4/2 몫=2 나머지 0,
* "123"   길이3 3/2 몫=1 나머지 1,
*
* if 나머지 == 0
*   배열의 길이 = 문자열길이 / 특정 길이
* else
*   배열의 길이 = 문자열의 길이 / 특정 길이 + 1;
*
* */
public class 잘라서배열로저장하기 {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int size = 0;
        if (len%n == 0)
            size = len/n;
        else
            size = len/n + 1;
        String[] answer = new String[size];

        for (int i=0; i<size; i++) {
            if (i == size-1)
                answer[i] = my_str.substring(n*i);     // substring (0,6) -> (6, 12) -> (12, 18) --> (18)
            else
                answer[i] = my_str.substring(n*i, n*(i+1));     // substring (0,6) -> (6, 12) -> (12, 18) --> (18)
        }
        return answer;
    }
}
