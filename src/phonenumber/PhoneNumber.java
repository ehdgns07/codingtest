package phonenumber;

public class PhoneNumber {
    public static void main(String[] args) {
        solution("010912321311326654985");
    }
    public static String solution(String phone_number) {

        StringBuilder sb = new StringBuilder();

        int length = phone_number.length()-4;
        String test = phone_number.substring(0, length);
        phone_number = phone_number.replace(test, "");

        for(int i = 0; i < length; i++){
            sb.append("*");
        }
        phone_number = sb.append(phone_number).toString();
        System.out.println(phone_number);
        return phone_number;
    }
}
