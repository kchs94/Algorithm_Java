package 붓캠.데일리.power_25;

public class Solution {
    static final int NUM = 94_906_249;
    public long power(int base, int exponent) { //3, 11
        if (exponent == 0) return 1L;
        // TODO:
        long newBase = base*base; // 3^2
        int newExponent; // 5
        boolean remain = false; // true

        if (exponent % 2 == 0)
            newExponent = exponent/2;
        else  {
            newExponent = exponent/2;
            remain = true;
        }

        long result = 1;
        for (int i=0; i<newExponent; i++) { //5번 반복
            result = ((result%NUM)*(newBase%NUM))%NUM;
        }
        if(remain)
            result = ((result%NUM)*(base%NUM))%NUM;

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.power(3, 11));
    }
}
