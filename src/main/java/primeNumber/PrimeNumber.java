package primeNumber;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(test(5));
    }

    public static int test(int n){
        int answer = 0;
        boolean flag;

        for(int i=2; i<=n ; i++){
            flag = false;

            for(int j = 2; j <= (int)(Math.sqrt(i)); j++){
                if(i%j==0){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                answer++;
            }
        }

        return answer;
    }
}
