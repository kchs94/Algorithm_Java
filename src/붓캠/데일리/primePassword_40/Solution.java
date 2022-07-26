package 붓캠.데일리.primePassword_40;

public class Solution {
    public static int primePassword(int curPwd, int newPwd) {
        // if curPwd == newPwd return 0;
        // newPwd가 1000이상 9999이하 소수인지 판별한다.
            // 아니면 return -1;
        // 두 비밀번호를 비교하여 각 자리수마다 불일치하면 카운트를 올린다.
        if (curPwd == newPwd) return 0;
        if (!isPrime(newPwd)) return -1;

        char[] curPwdArr = String.valueOf(curPwd).toCharArray();
        char[] newPwdArr = String.valueOf(newPwd).toCharArray();
        int count = 0;

        for (int i=0; i<curPwdArr.length; i++) {
            if (curPwdArr[i] != newPwdArr[i]) count++;
        }

        return count++;
    }

    public static boolean isPrime(int num) {
        for (int i=2; i<=(int) Math.sqrt(num); i++) {
            if (num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(primePassword(3733, 8779));
    }
}
