package strangeString;

public class StrangeString {
    public static void main(String[] args) {

        System.out.println(strange("Afdf ASD gASDsdf   "));
    }

    public static String strange(String s){

        String[] tmp = s.split(" ", -1);
        String forReturn = "";


        for (int i = 0 ; i < tmp.length; i++){
            for(int j = 0; j < tmp[i].length(); j++ ){
                if((tmp[i].charAt(j) < 65 || tmp[i].charAt(j) > 90) && (tmp[i].charAt(j) < 97 || tmp[i].charAt(j) > 122)){
                    continue;
                }
                if(j%2==0){
                    forReturn += String.valueOf(tmp[i].charAt(j)).toUpperCase();
                }else{
                    forReturn += String.valueOf(tmp[i].charAt(j)).toLowerCase();
                }
            }
            if(i != tmp.length-1) {
                forReturn += " ";
            }
        }


        return forReturn;
    }
}
