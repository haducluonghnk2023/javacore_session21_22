package Ex22.Ex08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_NAME = "product.dat";

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 1500.50));
        products.add(new Product(2, "Smartphone", 799.99));
        products.add(new Product(3, "Tablet", 500.00));
        products.add(new Product(4, "Headphones", 199.99));
        writeProductsToFile(products);
        List<Product> products2 = readProductsFromFile();
        System.out.println("Danh sách sản phẩm đọc từ file:");
        for (Product product : products2) {
            System.out.println(product);
        }
    }
    public static void writeProductsToFile(List<Product> products) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(products);
            System.out.println("Ghi file thành công.");
        }catch (Exception e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
    public static List<Product> readProductsFromFile() {
        List<Product> products = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            products = (List<Product>) ois.readObject();
        }catch (Exception e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return products;
    }
}
