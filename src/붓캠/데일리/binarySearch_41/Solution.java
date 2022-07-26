package 붓캠.데일리.binarySearch_41;

public class Solution {
    public int binarySearch(int[] arr, int target) {
        // TODO:
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while(low <= high) {
            mid = low + high;

            if (target == arr[mid])
                return mid;
            else if (target < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.binarySearch(new int[]{4, 5, 6, 9}, 100));
    }
}
