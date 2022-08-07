package reverseInt;


public class ReverseInt {
    public static void main(String[] args) {
        solution(12345);
    }
    public static int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.reverse();

        int length = sb.length();
        int[] answer = new int[length];
        char[] middle = new char[length];
        sb.getChars(0,length, middle,0);

        for (int i = 0; i < length ; i++){
            answer[i] = Integer.parseInt(String.valueOf(middle[i]));
        }

        return answer;

    }
}
