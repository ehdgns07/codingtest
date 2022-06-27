package phonenumber.harshad;

public class HarshadNumber {

    public static void main(String[] args) {
        solution(18);
    }
    public static boolean solution(int x) {
        Integer harshad = x;
        String checkHarshad = harshad.toString();
        char[] test = new char[5];
        Integer sum = 0;

        checkHarshad.getChars(0,checkHarshad.length(),test,0);

        for(int i = 0; i < test.length; i ++){
            int temp = Character.getNumericValue(test[i]);
            if(temp!=-1) {
                sum += Character.getNumericValue(test[i]);
            }
        }

        if(harshad%sum == 0){
            System.out.println("success");
            return true;
        }
            return false;
    }
}
