package 붓캠.데일리.rotatedArraySearch;


public class Solution {
    public int rotatedArraySearch(int[] rotated, int target) {
        int left = 0;
        int right = rotated.length - 1;

        while(left <= right) {
            int mid = (right - left) / 2;

            if (target == rotated[mid]) return mid;

            // mid 왼쪽 요소들은 정렬된 상태
            if (rotated[left] < rotated[mid]) {
                if (target > rotated[mid] && target <= rotated[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            //mid 오른쪽 요소들은 정렬된 상태
            else {
                if (target >= rotated[left] && target < rotated[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }

        return -1;
    }
}
