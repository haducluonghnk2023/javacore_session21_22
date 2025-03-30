package exception;

import java.util.Scanner;

public class Throw_Throws_Demo {
    public static void main(String[] args) throws CustomerException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao so thu hai ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("ket qua" + div(a,b));
    }
    public static int div(int a, int b) throws CustomerException{
//        if (b == 0){
//            throw new ArithmeticException("Division by zero");
//        }
        int div = a/b;
        return div;
    }
}
