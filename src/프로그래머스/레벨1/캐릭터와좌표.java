package 프로그래머스.레벨1;

public class 캐릭터와좌표 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int xMargin = board[0]/2;
        int yMargin = board[1]/2;
        int x = 0;
        int y = 0;

        for (int i=0; i<keyinput.length; i++) {
            if (keyinput[i].equals("left") && Math.abs((x - 1)) <= xMargin)
                x--;
            else if (keyinput[i].equals("right") && Math.abs((x + 1)) <= xMargin)
                x++;
            else if (keyinput[i].equals("up") && Math.abs((y + 1)) <= yMargin)
                y++;
            else if (keyinput[i].equals("down") && Math.abs((y - 1)) <= yMargin)
                y--;
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}
