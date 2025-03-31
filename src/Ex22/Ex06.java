package Ex22;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "copy.txt";
        writeToFile(inputFile, "Lập trình Java thật thú vị");
        String reversedContent = reverseContent(inputFile);
        writeToFile(outputFile, reversedContent);
        System.out.println("Nội dung file copy.txt:");
        readFile(outputFile);
    }
    public static void writeToFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Đã ghi vào file " + filename);
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
    public static String reverseContent(String filename) {
        StringBuilder content = new StringBuilder();
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File không tồn tại!");
            return "";
        }
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return content.reverse().toString();
    }
    public static void readFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File không tồn tại!");
            return;
        }
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
