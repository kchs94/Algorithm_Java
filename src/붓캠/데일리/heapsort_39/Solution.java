package 붓캠.데일리.heapsort_39;

import java.util.PriorityQueue;

public class Solution {
    public int[] heapSort(int[] arr) {
        // TODO:
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Integer e : arr) {
            pq.add(e);
        }
        int[] answer = new int[arr.length];

        for (int i=0; i<answer.length; i++) {
            answer[i] = pq.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println();
        for (Integer e : sol.heapSort(new int[]{3,2,1,4,5})) {
            System.out.print(e + " ");
        }
    }
}
