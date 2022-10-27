package 해커랭크.정규식;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Pattern p = Pattern.compile("^\\d[^awiou][^bcDF]\\S[^AEIOU][^.,]$");
        while (N-- > 0) {

            Matcher m = p.matcher(sc.nextLine());
            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
