package inputString;

public class JoinStrings {

    public static String scann() {

        String str = "";

        while (true){

            String s = UserInout.scann("Enter the character, press Z to complete the input. ");

            if("Z".equals(s)){
                break;
            }else {
                str += s;
            }


        }
        return str;
    }
}
