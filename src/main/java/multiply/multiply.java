package multiply;

import java.util.Arrays;

public class multiply {
    public static void main(String[] args) {
        long[] answer = solution(2, 5);
        Arrays.stream(answer).forEach(System.out::println);
    }

    public static long[] solution(int x, int n) {

        long[] answer = new long[n];

        if(!(x>-10000000L && x<10000000L)){
            return answer;
        }

        if((n>1000) && (n<0L)){
            return answer;
        }

        for(long i = 0; i < n; i++){
            int a = (int) i;
            answer[a] = x*(i+1);
        }

        return answer;
    }

}
