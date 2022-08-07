package descending;

import static java.lang.Long.parseLong;

public class Descending {

    public static void main(String[] args) {
        solution(118372L);
    }
    public static long solution(long n){
        Long num = n;
        String numToString = num.toString();
        int length = numToString.length();
        char[] stringToCharArray = numToString.toCharArray();
        Long.toString(n).chars().sorted().forEach(c -> System.out.println(Character.valueOf((char)c)));

        for(int i = 0; i<length ; i++){
            for(int j = 0; j < length; j++){
                if(stringToCharArray[i] > stringToCharArray[j]){
                    char tmp = stringToCharArray[j];
                    stringToCharArray[j] = stringToCharArray[i];
                    stringToCharArray[i] = tmp;
                }
            }

        }
        StringBuilder sb = new StringBuilder();
        sb.append(stringToCharArray);
        num = parseLong(sb.toString());

        System.out.println(num);
        return num;
    }
}
