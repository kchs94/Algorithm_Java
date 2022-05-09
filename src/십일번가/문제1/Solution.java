package 십일번가.문제1;

public class Solution {
    public static int solution(int A, int B) {
        // write your code in Java SE 8
        char[] charA = String.valueOf(A).toCharArray();
        char[] charB = String.valueOf(B).toCharArray();
        int lenA = charA.length;
        int lenB = charB.length;

        for (int i=0; i<lenB-lenA+1; i++) {
            for (int j=0; j<lenA; j++) {
                if (charA[j] != charB[i+j])
                    break;
                else {
                    if (j == (lenA-1))
                        return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(solution(10,10 ));
    }
}
