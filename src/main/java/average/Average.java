package average;

public class Average {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        solution(arr);
    }
    public static double solution(int[] arr) {

        int totalCount = arr.length;
        int total = 0;
        double average;


        for (int i=0; i<totalCount; i++){
            total += arr[i];
        }

        average = (double) total/totalCount;
        System.out.println(average);

        return average;
    }
}
