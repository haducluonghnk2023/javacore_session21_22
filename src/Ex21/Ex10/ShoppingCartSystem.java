package Ex21.Ex10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("P1", "Áo Thun", 150000),
                new Product("P2", "Quần Jean", 300000),
                new Product("P3", "Giày Sneaker", 500000)
        );
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Xem danh sách sản phẩm có sẵn");
            System.out.println("2. Thêm sản phẩm vào giỏ hàng");
            System.out.println("3. Xóa sản phẩm khỏi giỏ hàng");
            System.out.println("4. Xem giỏ hàng");
            System.out.println("5. Hiển thị tổng tiền");
            System.out.println("6. Thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách sản phẩm:");
                    for (Product p : products) {
                        System.out.println(p.getId() + " - " + p.getName() + " - " + p.getPrice() + " VNĐ");
                    }
                    break;
                case 2:
                    System.out.print("Nhập mã sản phẩm: ");
                    String productId = sc.nextLine();
                    System.out.print("Nhập số lượng: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    Product product = products.stream().
                            filter(product1 -> product1.getId().equals(productId)).findFirst().
                            orElse(null);
                    if (product != null) {
                        cart.addToCart(product, quantity);
                    } else {
                        System.out.println("Lỗi: Không tìm thấy sản phẩm!");
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm cần xóa: ");
                    cart.removeFromCart(sc.nextLine());
                    break;
                case 4:
                    cart.displayCart();
                    break;
                case 5:
                    cart.checkout();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }while (true);
    }
}
