package array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[][] arr1 = { { 1 }, { 2 } };
        int[][] arr2 = { { 3 }, { 4 } };
        solution(arr1, arr2);
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr1.length];

        long count1 = (int) Arrays.stream(arr1).count();
        long count2 = (int) Arrays.stream(arr1).count();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}

// for (int i = 0; i < arr1.length; i++) {
//     for (int j = 0; j < arr2.length; j++) {
//     System.out.println(answer[i][j]);
//     }
//     }