package collatz;

public class Collatz {

    public static void main(String[] args) {
        System.out.println(solution(10000));
    }

    public static int solution(int num) {

        int i;

        if(num == 1) {
            return 0;
        }

        for(i = 0; i <500; i++){

            if(num%2 == 0){
                num = num/2;
            }
            else if(num%2 == 1){
                num = num * 3 + 1;
            }

            if(num == 1){
                return i+1;
            }

        }

        if(i == 500){
            return -1;
        }

        return i;
    }
}
