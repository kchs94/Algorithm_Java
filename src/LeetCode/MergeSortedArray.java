package LeetCode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2, if any
            nums1[finished--] = nums2[tail2--];
        }
    }

    public static void main(String[] args) {
        MergeSortedArray sol = new MergeSortedArray();
        sol.merge(new int[]{0},0,new int[]{1}, 1);
    }
}
