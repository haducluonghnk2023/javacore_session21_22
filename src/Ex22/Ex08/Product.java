package Ex22.Ex08;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Price: %.2f VND", id, name, price);
    }
}
