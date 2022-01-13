package 프로그래머스.레벨1.소수만들기;

public class Solution {
    public int solution(int[] nums) {
        int answer=0;
        int sum;

        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                for (int k=j+1; k< nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum))
                        answer++;
                }
            }
        }

        return answer;
    }

    private boolean isPrime(int num) {
        if (num < 2)    // 0, 1
            return false;
        else if (num == 2)  // 2이면 소수니깐
            return true;
        else {  // 3이상이면
            for (int i=2; i<num/2; i++) {
                if (num%i == 0) // 나머지가 0이면 나눠진다는 말이므로
                    return false;
            }
            return true;    // 나눠지는게 없었으므로 소수
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(s.solution(nums1));

        int[] nums2 = {1, 2, 7, 6, 4};
        System.out.println(s.solution(nums2));
    }
}
