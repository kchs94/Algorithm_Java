package 프로그래머스.레벨1.키패드누르기;

public class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int left_xPos = 0;
        int left_yPos = 3;
        int right_xPos = 2;
        int right_yPos = 3;

        for (int x : numbers) {
            if (x == 1 || x == 4 || x == 7) {
                sb.append("L");
                left_xPos = 0;
                left_yPos = x/3;
            }
            else if (x == 3 || x == 6 || x == 9) {
                sb.append("R");
                right_xPos = 2;
                right_yPos = x/3 - 1;
            }
            else if (x == 2 || x == 5 || x == 8 || x == 0) {
                if (x == 0)
                    x += 11;
                int target_xPos = 1;
                int target_yPos = x/3;
                int leftDistance = Math.abs(target_xPos - left_xPos) + Math.abs(target_yPos - left_yPos);
                int rightDistance = Math.abs(target_xPos - right_xPos) + Math.abs(target_yPos - right_yPos);

                if (leftDistance < rightDistance) {
                    sb.append("L");
                    left_xPos = 1;
                    left_yPos = x/3;
                }
                else if(leftDistance > rightDistance) {
                    sb.append("R");
                    right_xPos = 1;
                    right_yPos = x/3;
                } else {
                    if (hand.equals("left")) {
                        sb.append("L");
                        left_xPos = 1;
                        left_yPos = x/3;
                    } else {
                        sb.append("R");
                        right_xPos = 1;
                        right_yPos = x/3;
                    }
                }

            }
        }
        answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] numbers1 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        System.out.println(s.solution(numbers1, "left"));

        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(s.solution(numbers2, "right"));
    }
}
