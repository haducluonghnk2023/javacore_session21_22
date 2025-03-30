package Ex21;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("nhap a");
            int a = sc.nextInt();
            System.out.println("nhap b");
            int b = sc.nextInt();
            int c = a/b;
            System.out.println("ket qua phep chia la "+c);
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
