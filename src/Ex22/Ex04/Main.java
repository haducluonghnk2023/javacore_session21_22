package Ex22.Ex04;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        writeFile();
        readFile();
    }
    public static void writeFile(){
        File file = new File("student.dat");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            Student student = new Student("Nguyễn Văn A", 20, 8.5);
            oos.writeObject(student);
            oos.flush();
            System.out.println("Đã ghi đối tượng vào file student.dat");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (oos != null) {
                try {
                    oos.close();
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
        File file = new File("student.dat");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Student student = (Student) ois.readObject();
            System.out.println("Đã đọc đối tượng từ file student.dat");
            System.out.println(student);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
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
