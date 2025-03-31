package Ex22;

import java.io.*;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        writeFile();
        readFile();
    }
    public static void writeFile(){
        File file = new File("ouput.txt");
        FileOutputStream fos = null;
        BufferedWriter bw = null;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhập chuỗi văn bản: ");
            String text = sc.nextLine();
            fos = new FileOutputStream(file);
            bw = new BufferedWriter(new OutputStreamWriter(fos));
            bw.write(text);
            bw.flush();
            System.out.println("Đã ghi vào file output.txt");
        }catch (Exception e){
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }finally{
            try {
                if (bw != null) bw.close();
                if (fos != null) fos.close();
                sc.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void readFile(){
        File file = new File("ouput.txt");
        FileInputStream fis = null;
        BufferedReader br = null;
        try {
            fis = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(fis));

            String line;
            System.out.println("Nội dung file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
