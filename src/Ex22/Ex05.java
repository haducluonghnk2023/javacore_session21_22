package Ex22;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        String fileName = "input.txt";
        writeToFile(fileName);
        findLongestName(fileName);
    }
    public static void writeToFile(String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Văn Lâm\n");
            writer.write("Tiến Linh\n");
            writer.write("Xuân Sơn\n");
            writer.write("Hoàng Đức\n");
            writer.write("Văn Hậu\n");
            System.out.println("Đã ghi vào file " + filename);
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
    public static void findLongestName(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File không tồn tại!");
            return;
        }

        String longestName = "";
        int maxLength = 0;

        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine().trim();
                if (name.length() > maxLength) {
                    longestName = name;
                    maxLength = name.length();
                }
            }

            System.out.println("Tên cầu thủ dài nhất: " + longestName);
            System.out.println("Độ dài của tên: " + maxLength);
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
