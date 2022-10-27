package 프로그래머스.레벨1;
/*
* 완전탐새으로 풀었다.
* 공백으로 분리된 문자열을 배열로 만든뒤 순회하면서 일치하는 morsecode가 있으면 인덱스를 활용하여 알파벳으로 맵핑해준다.
* */
public class 모스부호1 {
    public String solution(String letter) {

        String[] morseCode = {".-","-...","-.-.","-..",".",
                "..-.","--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.","...","-",
                "..-","...-",".--","-..-","-.--","--.."};

        String[] splitLetter = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<splitLetter.length; i++) {
            for (int j=0; j<morseCode.length; j++) {
                if (splitLetter[i].equals(morseCode[j])) {
                    sb.append((char)('a'+j));
                    break;
                }
            }
        }

        return sb.toString();
    }
}
