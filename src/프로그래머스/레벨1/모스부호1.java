package 프로그래머스.레벨1;

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
