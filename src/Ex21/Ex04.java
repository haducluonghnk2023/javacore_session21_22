package Ex21;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap vao so");
            int a = Integer.parseInt(sc.nextLine());
            System.out.printf("Bạn đã nhập: %d\n",a);
        }catch (Exception e){
            System.err.println("Lỗi: Bạn phải nhập số nguyên!");
        }finally {
            System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
        }
    }
}
