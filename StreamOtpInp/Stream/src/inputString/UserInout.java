package inputString;

import java.util.Scanner;

public class UserInout {

    private static Scanner scanner = new Scanner(System.in);

    public static String scann(String  msg) {

        System.out.print(msg);

        return scanner.nextLine();
    }

}
