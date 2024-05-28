package src.main;

import java.util.Scanner;

public class UserInput {

    private static Scanner scanner;

    public static UserInput instance = new UserInput();

    private UserInput() {
        scanner = new Scanner(System.in);
    }

    public static String getInput() {
        return scanner.nextLine();
    }
}
