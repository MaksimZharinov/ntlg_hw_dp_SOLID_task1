package src.main;

import src.intrfaces.Shown;
import src.resources.Product;

import java.util.HashMap;
import java.util.Map;

public class Basket implements Shown {
    private Map<Product, Integer> basket;

    Basket() {
       basket = new HashMap<>();
    }

    public void add(Product product, int q) {
        if (basket.containsKey(product)) {
            basket.put(product, (basket.get(product) + q));
        } else {
            basket.put(product, q);
        }
    }

    @Override
    public void show() {
        System.out.println("In your basket now: ");
        if (basket.isEmpty() || basket == null) {
            System.out.println("Your basket is empty");
        }
        for (Product product : basket.keySet()) {
            System.out.println(product.name() + " " + basket.get(product));
        }
    }
}
