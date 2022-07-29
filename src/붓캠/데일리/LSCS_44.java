package 붓캠.데일리;
/*
*
* 합 배열 미리 만들기
* */
public class LSCS_44 {
    public static int LSCS(int[] arr) {
        int[] S = new int[arr.length]; // [1, 2, 3] -->  [1, 3, 6] = [a1, a1+a2, a1+a2+a3] , an = Sn-Sn-1, [S1, S2, S3]
        int answer = Integer.MIN_VALUE;

        int sum = 0;
        for (int i=0; i<S.length; i++) {
            sum += arr[i];
            S[i] = sum;
            answer = Math.max(answer, S[i]);
        }

        for (int i=1; i<S.length; i++){
            for (int j=0; j<i; j++) {
                answer = Math.max(answer, S[i]-S[j]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int output = LSCS(new int[]{-7,-6,-9});
        System.out.println(output); // --> 6
    }
}
