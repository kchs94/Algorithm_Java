package 시험.윈터코딩;

/*
 * 문자가 1개라면 한 문자만 이어 붙인다.
 * 문약 문자가 2개 이상이라면 문자 + *로 이어붙인다.
 *
 * a -->a
 * aa --> a*
 * ab --> ab
 * abbbc --> ab*c
 * 끝처리가 어렵다.
 * */
public class EX1 {
    public String solution(String line) {
        String answer = "";
        if (line.length() == 1)
            return line;
        char[] arr = line.toCharArray();

        int index = 0;
        int count = 1;
        char target = arr[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++) {
            if (target == arr[i]) {
                count++;
                index++;
                if (i == arr.length - 1) {
                    if (count == 1) {
                        sb.append(target);
                    } else {
                        sb.append(target + "*");
                    }
                }
            } else {
                if (count == 1) {
                    sb.append(target);
                } else {
                    sb.append(target + "*");
                }
                target = arr[i];
                if (i == arr.length - 1) {
                    sb.append(target);
                }
                count = 1;
            }
        }

        return sb.toString();
    }
}
