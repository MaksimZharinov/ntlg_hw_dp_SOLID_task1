package src.resources;

public enum SelectItems {
    SHOW_PRODUCTS("Show products"),
    SHOW_BASKET("Show basket"),
    ADD_PRODUCT("Add product");


    private String message;

    SelectItems(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
