package src.main;

import src.resources.Message;

public class Main {

    public static void main(String[] args) {
        String input;
        int select;
        Basket basket = new Basket();

        while(Message.getStart()) {
            input = UserInput.getInput();
            if (input.isEmpty()) continue;
            if (input.toLowerCase().equals(Message.STOP.getMessage().toLowerCase())) {
                System.out.println(Message.BYE.getMessage());
                break;
            }
//            if (!checkInput(input)) {
                continue;
            }
        }

    }

//    void checkSelect(String select) {
//
//    }
//
////    public static boolean checkInput(String input) {
////        if (input.charAt(0) != )
////    }

//}

