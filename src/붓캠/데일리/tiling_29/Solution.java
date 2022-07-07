package 붓캠.데일리.tiling_29;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    ArrayList<Integer> dp = new ArrayList<>(Arrays.asList(0,1,2));

    public int tiling(int num) {
        if (dp.size() > num)
            return dp.get(num);

        dp.add(tiling(num-2) + tiling(num-1));
        return dp.get(num);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.tiling(4));
    }

}
