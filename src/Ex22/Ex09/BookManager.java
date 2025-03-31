package Ex22.Ex09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static final String FILE_NAME = "book.dat";
    private List<Book> bookList;

    public BookManager() {
        this.bookList = readBooksFromFile();
    }

    public void addBook(Book book) {
        bookList.add(book);
        saveBooksToFile();
    }

    public void updateBook(Book book) {
        for (Book b : bookList) {
            if (b.getId() == book.getId()) {
                b.updateBook(book.getName(), book.getName(), book.getName(), book.getId());
                saveBooksToFile();
                return;
            }
        }
        System.out.println("Không tìm thấy sách có ID: " + book.getId());
    }

    public void deleteBook(String title) {
        bookList.removeIf(book -> book.getName().equalsIgnoreCase(title));
        saveBooksToFile();
    }

    public void displayAllBooks() {
        bookList.forEach(System.out::println);
    }

    private void saveBooksToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(bookList);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    private List<Book> readBooksFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Book>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
}
