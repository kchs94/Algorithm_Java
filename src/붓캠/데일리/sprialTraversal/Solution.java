package 붓캠.데일리.sprialTraversal;

public class Solution {
    static final int RIGHT = 0;
    static final int DOWN= 1;
    static final int LEFT = 2;
    static final int UP = 3;
    public static String spiralTraversal(Character[][] matrix) {
        StringBuilder sb = new StringBuilder();

        int top = 0;
        int down = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int direction = 0;

        while(top <= down && left <= right) {
            if (direction == RIGHT){
                for (int i=left; i<=right; i++) {
                    sb.append(matrix[top][i]);
                }
                top += 1;
            }
            else if (direction == DOWN){
                for (int i=top ; i<= down; i++) {
                    sb.append(matrix[i][right]);
                }
                right -= 1;
            }
            else if (direction == LEFT) {
                for (int i=right; i>=left; i--) {
                    sb.append(matrix[down][i]);
                }
                down -= 1;
            }
            else if (direction == UP) {
                for (int i=down ; i>=top; i--)
                    sb.append(matrix[i][left]);
                left += 1;
            }

            direction = (direction + 1) % 4;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Character[][] matrix = new Character[][]{
                {'T', 'y', 'r', 'i'},
                {'i', 's', 't', 'o'},
                {'n', 'r', 'e', 'n'},
                {'n', 'a', 'L', ' '},
        };
        String output = spiralTraversal(matrix);
        System.out.println(output); // --> "ABCFIHGDE"
    }

}