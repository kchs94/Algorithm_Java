package 붓캠.데일리.largestProductOfThree;

public class Solution {
    public int largestProductOfThree(int[] arr) {

        int max = Integer.MIN_VALUE;

        // 입력 크기가 작으니 3중 for문으로 3개 숫자 선택하기
        for(int i = 0; i<arr.length-2; i++) {
            for (int j=i+1; j<arr.length-1; j++) {
                for (int k=j+1; k<arr.length; k++) {
                    int product = arr[i]*arr[j]*arr[k];
                    if (max < product) max = product;
                }
            }
        }

        return max;
    }
}
