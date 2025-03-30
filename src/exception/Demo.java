package exception;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhap vao so thu nhat ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap vao so thu hai ");
            int b = Integer.parseInt(sc.nextLine());
            int div =  a / b;
            System.out.println("ket qua phep chia la "+div);
        }catch(ArithmeticException e1){
            System.out.println("Khong the chia cho 0");
        }catch (NumberFormatException e2){
            System.out.println(e2.getMessage());
        }catch (Exception ex){
            ex.printStackTrace();
        }

        try{
            int[] number = {1,3,5,7,9};
            System.out.println("Nhap vao chi so can lay gia tri ");
            int index = Integer.parseInt(sc.nextLine());
            System.out.println("gia tri phan tu " +number[index]);
        }catch (ArrayIndexOutOfBoundsException |  NumberFormatException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            // thuc hien cac cong viec ma du co ex hay khong van phai lam
            System.out.println("ket thuc qua trinh xu ly voi mang.");
        }

        System.out.println("chuong trinh ket thuc binh thuong");
    }
}
