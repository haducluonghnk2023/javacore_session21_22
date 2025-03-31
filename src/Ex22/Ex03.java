package Ex22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) {
        createInputFile();
        copyFile();
        readFile();
    }
    public static void createInputFile(){
        File file = new File("input.txt");
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(file);
            String content = "Hello World!";
            fos.write(content.getBytes());
            fos.flush();
            System.out.println("Đã tạo file input.txt");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void copyFile(){
        File inputFile = new File("input.txt");
        File outputFile = new File("copy.txt");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream(inputFile);
            fos = new FileOutputStream(outputFile);
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            fos.flush();
            System.out.println("Đã sao chép nội dung từ input.txt sang copy.txt");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void readFile(){
        File file = new File("copy.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            System.out.println("\nNội dung của copy.txt:");
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
