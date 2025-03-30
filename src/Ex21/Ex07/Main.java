package Ex21.Ex07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(100000);
        System.out.println("Nhập số tiền cần rút: ");
        try{
            account.withdraw(Double.parseDouble(sc.nextLine()));
        }catch (NumberFormatException e){
            System.out.println("Lỗi: Vui lòng nhập một số hợp lệ!");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
