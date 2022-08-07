package descendingString;

import java.sql.Array;
import java.util.*;

public class DescendingString {
    public static void main(String[] args) {
        System.out.println(solution("Zabc"));
    }

    public static String solution(String s){
        char[] array = s.toCharArray();
        String str = "";

        Arrays.sort(array);

        int length = array.length;

        for (int i = 0; i < length; i++) {
            boolean b = array[i] == 'p';
            str = str.concat(String.valueOf(array[length - i-1]));
        }

        return str;
    }
}
