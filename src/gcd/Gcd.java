package gcd;

import java.util.Arrays;

public class Gcd {

    public static void main(String[] args) {
        solution(10, 100);
    }

    public static int[] solution(int n, int m) {

        int i;
        int[] answer = new int[2];

        if(n>m){
            i = n;
        }else{
            i = m;
        }

        while( n % i != 0 || m % i != 0){

            i--;

        }

        answer[0] = i;

        i = Math.max(n, m);

        while ((i % n != 0) || (i % m != 0)) {
            i++;
        }

        answer[1] = i;

        Arrays.stream(answer).forEach(System.out::println);

        return answer;
    }

}
