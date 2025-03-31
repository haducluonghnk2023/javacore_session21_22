package Ex22;

import java.io.File;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên tệp từ bàn phím :");
        String fileInput  = sc.nextLine();
        File file = new File(fileInput);

        try{
            if(file.exists()){
                System.out.println("Tệp đã tồn tại.");
            }else {
                if(file.createNewFile()){
                    System.out.println("Tệp đã được tạo.");
                }else {
                    System.out.println("Không thể tạo tệp.");
                }
            }
        }catch(Exception e){
            System.out.println("Lỗi khi xử lý tệp: " + e.getMessage());
        }finally {
            sc.close();
        }
    }

}
