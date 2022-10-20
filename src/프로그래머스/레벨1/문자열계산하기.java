package 프로그래머스.레벨1;
/*
* 첫 원소는 그냥 더해준다.
* 반복문을 순회하면서 연산자일 때 액션을 취해준다.
*   - 다음 인덱스의 값을 이용한다.
* */
public class 문자열계산하기 {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        if (arr[0].equals("+") || arr[0].equals("-")) {
            for (int i=0; i<arr.length; i++) {
                if (arr[i].equals("+"))
                    answer += Integer.parseInt(arr[i+1]);
                else if (arr[i].equals("-"))
                    answer -= Integer.parseInt(arr[i+1]);
            }
        }
        else {
            answer += Integer.parseInt(arr[0]);
            for (int i=1; i<arr.length; i++) {
                if (arr[i].equals("+"))
                    answer += Integer.parseInt(arr[i+1]);
                else if (arr[i].equals("-"))
                    answer -= Integer.parseInt(arr[i+1]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        문자열계산하기 sol = new 문자열계산하기();

        System.out.println(sol.solution("3 + 4"));
    }
}
