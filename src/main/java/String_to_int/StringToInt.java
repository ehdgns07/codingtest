package String_to_int;

public class StringToInt {

    public static void main(String[] args) {
        System.out.println(solution("a234"));
    }

    public static boolean solution(String s){
        boolean answer = false;

        if(s.length() != 4 && s.length() != 6){
            return answer;
        }

        try{
            int a = Integer.parseInt(s);
        }catch (NumberFormatException e){
            return answer;
        }

        return true;
    }
}
