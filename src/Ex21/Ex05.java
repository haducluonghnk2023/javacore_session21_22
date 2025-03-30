package Ex21;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhập một số nguyên: ");
            int n = sc.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("Số nguyên tố phải lớn hơn 0.");
            }
            if (checkPrime(n)) {
                System.out.println(n + " là số nguyên tố.");
            } else {
                System.out.println(n + " không phải là số nguyên tố.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ.");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
