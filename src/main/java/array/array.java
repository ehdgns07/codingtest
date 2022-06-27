package array;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class array {
    public static void main(String[] args) {
        int[][] arr1 = { { 1 },
                         { 2 } };
        int[][] arr2 = { { 1 },
                         { 2 } };
        solution(arr1, arr2);
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr1[0].length];
        int count = arr1.length;
        int count2 = arr1[0].length;

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count2; j++) {

                    answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < count2; j++) {
                System.out.print(answer[i][j]+ " ");
            }
            System.out.println();
        }

        return answer;
    }
}

