package src.resources;

import src.intrfaces.Shown;

public enum Product {
    MILK(100),
    BREAD(50),
    BUTTER(150),
    EGG(10),
    MEAT(400),
    POTATO(40),
    CARROT(30),
    ONION(20);

    private int price;

    Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
