package indexforascending;

import java.util.Arrays;
import java.util.Objects;

public class IndexForAscending {

    public static void main(String[] args) {
        String[] strings = {"sun","bed","car"};
        solution(strings, 1);
    }

    public static String[] solution(String[] strings, int n){
        String tmp;

        for (int j = 0; j < strings.length-1; j++) {
            for (int i = 0; i < strings.length - 1; i++) {
                if (strings[i].charAt(n) > strings[i + 1].charAt(n)) {
                    tmp = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = tmp;
                }
                if(Objects.equals(strings[i].charAt(n), strings[i + 1].charAt(n))){

                }
            }
        }
        Arrays.stream(strings).forEach(System.out::println);
        return strings;
    }
}
