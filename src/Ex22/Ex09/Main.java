package Ex22.Ex09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Quản lý sách ===");
            System.out.println("1. Thêm sách");
            System.out.println("2. Cập nhật sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Hiển thị tất cả sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập ID sách: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên sách: ");
                    String title = scanner.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String author = scanner.nextLine();
                    System.out.print("Nhập nhà xuất bản: ");
                    String publisher = scanner.nextLine();
                    System.out.println("Nhập giá sách :");
                    double price = scanner.nextDouble();
                    bookManager.addBook(new Book(id, title, author, publisher,price));
                    System.out.println("Sách đã được thêm thành công!");
                    break;
                case 2:
                    System.out.print("Nhập ID sách cần cập nhật: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên sách mới: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Nhập tác giả mới: ");
                    String newAuthor = scanner.nextLine();
                    System.out.print("Nhập nhà xuất bản mới: ");
                    String newPublisher = scanner.nextLine();
                    System.out.println("Nhập giá sách mới :");
                    double priceNew = scanner.nextDouble();
                    bookManager.updateBook(new Book(updateId, newTitle, newAuthor, newPublisher, priceNew));
                    break;
                case 3:
                    System.out.print("Nhập tên sách cần xóa: ");
                    String deleteTitle = scanner.nextLine();
                    bookManager.deleteBook(deleteTitle);
                    System.out.println("Sách đã được xóa!");
                    break;
                case 4:
                    System.out.println("Danh sách sách:");
                    bookManager.displayAllBooks();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
            }
        }
    }
}
