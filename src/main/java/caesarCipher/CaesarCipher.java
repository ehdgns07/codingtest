package caesarCipher;

import java.util.Objects;

public class CaesarCipher {
    public static void main(String[] args) {

        System.out.println(solution("a B z", 4));

    }

    public static String solution(String s, int n) {
        char[] charSequence = s.toCharArray();
        String answer = "";
        for (char c : charSequence) {
            if(Objects.equals(' ', c)){
                answer = answer.concat(" ");
                continue;
            }

            int ascii = c+n;
            if(c>64&& c<91 && ascii>90){
                ascii = ascii-26;
            }
            if(c>97 && ascii > 122){
                ascii = ascii-26;
            }

            answer = answer.concat(Character.toString(ascii));
        }

        return answer;
    }
}
