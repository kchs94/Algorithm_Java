package LeetCode;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(Integer item : nums) {
            if (item == 0) {
                count = 0;
            } else {
                count++;
                max = Math.max(count, max);
            }
        }
        return max;
    }
}
