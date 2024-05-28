package src.resources;

public enum Message {

    BYE("Good bye"),
    SELECT("Select item"),
    STOP("Stop"),
    TYPE("Type item number"),
    TYPE_STOP("Type \"stop\" to stop the program"),
    ERROR_INT("Your input is not valid number. Try again."),
    PRODUCTS("All the products we have now: "),
    ADD_PRODUCT("Type product");

    private String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static boolean getStart() {
        System.out.println(Message.SELECT.getMessage());
        for (SelectItems item : SelectItems.values()) {
            System.out.println((item.ordinal() + 1) + ". " + item.getMessage());
        }
        System.out.println(Message.TYPE.getMessage());
        System.out.println(Message.TYPE_STOP.getMessage());
        return true;
    }
}
