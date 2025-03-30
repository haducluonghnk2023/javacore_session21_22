package Ex21.Ex10;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    Map<String,CartItem>  cartItems = new HashMap<String,CartItem>();

    public void addToCart(Product product, int quantity) {
        if (quantity <= 0) {
            System.out.println("Lỗi: Số lượng không hợp lệ!");
            return;
        }
        if (!cartItems.containsKey(product.getId())) {
            cartItems.put(product.getId(), new CartItem(product, 0));
        }
        cartItems.get(product.getId()).increaseQuantity(quantity);
        System.out.println("Đã thêm sản phẩm: " + product.getName() + " - Số lượng: " + quantity);
    }

    public void removeFromCart(String productId) {
        if (!cartItems.containsKey(productId)) {
            System.out.println("Lỗi: Không tìm thấy sản phẩm trong giỏ hàng!");
            return;
        }
        cartItems.remove(productId);
        System.out.println("Đã xóa sản phẩm khỏi giỏ hàng.");
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Giỏ hàng trống.");
            return;
        }
        System.out.println("Giỏ hàng:");
        for (CartItem item : cartItems.values()) {
            System.out.println(item.getProduct().getName() + " - Số lượng: " + item.getQuantity());
        }
    }

    public void checkout() {
        double total = cartItems.values().stream().
                mapToDouble(item->item.getProduct().getPrice() * item.getQuantity()).
                sum();
        System.out.println("Tổng tiền cần thanh toán: " + total + " VNĐ");
    }

}
