package without_minimum;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WithoutMinimum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,7,6};
        solution(arr);
    }
    public static int[] solution(int[] arr) {

        int length = arr.length;
        int[] answer = new int[length-1];
        int num = arr[0];

        if(arr.length == 1){
            return new int[] {-1};
        }

        for (int i = 0 ; i < length; i ++){
            if(num > arr[i]) {
                num = arr[i];
            }
        }

        int order = 0;

        for(int j = 0 ; j < length; j++){
            if(num != arr[j]) {
                answer[order++] = arr[j];
            }
        }

        for(int j = 0 ; j < length-1; j++){
            log.debug("{}", answer[j]);
        }


        return answer;
    }
}
