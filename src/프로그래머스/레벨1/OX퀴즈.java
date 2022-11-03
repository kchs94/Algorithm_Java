package 프로그래머스.레벨1;

public class OX퀴즈 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i=0; i< quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
//            System.out.println(Arrays.toString(arr));
            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            int result = Integer.parseInt(arr[4]);
            String operator = arr[1];

            if (operator.equals("+"))
                if (num1 + num2 == result)
                    answer[i] = "O";
                else
                    answer[i] = "X";
            else
                if (num1 - num2 == result)
                    answer[i] = "O";
                else
                    answer[i] = "X";
        }



        return answer;
    }
}
