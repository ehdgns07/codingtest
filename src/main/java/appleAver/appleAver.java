package appleAver;

import java.util.Arrays;

public class appleAver {
    public static void main(String[] args){
        int[] s={4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
//        int[] s={6,5,3,1,8,7,2,4};
        System.out.println(solution(4,3, s));
    }
    public static int solution(int k, int m, int[] score) {
        int answer = 0;
        int tmp = 0;
        int count = 0;

//        quick(score, 0, score.length-1);

        Arrays.sort(score);

        for (int i = 0; i < score.length - 1; i++) {
            System.out.println(score[i]);
        }

        count = score.length / m;
        int mul = 1;
        for(int i=count; i > 1; i--){
            answer += score[score.length - (mul*m+1)] * m;
            mul++;
        }

        return answer;
    }

    public static void quick(int[] score, int left, int right){
        if(left>right){
            return;
        }

        work(score,left,right);

    }

    public static int work(int[] score, int left, int right) {
        int pivot = (left+right)/2;

        int le = left, ri= right;



        return le;
    }

    private static void swap(int[] score, int le, int ri) {
        int tmp = 0;

        tmp = score[le];
        score[le] = score[ri];
        score[ri] = tmp;
    }
}