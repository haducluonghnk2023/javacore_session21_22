package file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Nguyen Van A",18));
        students.add(new Student(2,"Nguyen Van B",19));
        students.add(new Student(3,"Nguyen Van C",20));
    }
    public static void writeFile(){
        /*
        * b1 khoi tao doi tuong file
        * b2 khoi tao doi tuong fileOutPutStream
        * b3 khoi tao doi tuong objOutputStream
        * b4 su dung phuong thuc write cua objOutputStream de ghi du lieu tu ra file
        * b5 day du lieu tu stream ra file(flush)
        * b6 dong file
        * */
        //b1
        File file = new File("demo.txt");
        // b2
        FileOutputStream fos  = null;
        ObjectOutputStream oos  = null;
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
//            oos.writeObject(new Student());
            oos.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static void readFile(){
        /*
         * b1 khoi tao doi tuong file
         * b2 khoi tao doi tuong fileInputStream
         * b3 khoi tao doi tuong objInputStream
         * b4 su dung phuong thuc write cua objInputStream de ghi du lieu tu ra file
         * b5 dong file
         * */
        File file = new File("demo.txt");
        FileInputStream fis  = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Student student = (Student) ois.readObject();
            System.out.println(student);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
