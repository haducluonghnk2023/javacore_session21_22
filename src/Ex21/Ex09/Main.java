package Ex21.Ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, BankAccount> accounts = new HashMap<>();
        accounts.put("123", new BankAccount("123", 1000000));
        accounts.put("456", new BankAccount("456", 500000));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tài khoản: ");
        String accountId = scanner.nextLine();
        BankAccount account = accounts.get(accountId);

        if (account == null) {
            System.err.println("Lỗi: Tài khoản không tồn tại!");
            return;
        }

        System.out.print("Nhập số tiền cần gửi: ");
        try {
            double depositAmount = Double.parseDouble(scanner.nextLine());
            account.deposit(depositAmount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Nhập số tiền cần rút: ");
        try {
            double withdrawAmount = Double.parseDouble(scanner.nextLine());
            account.withdraw(withdrawAmount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Nhập số tài khoản nhận: ");
        String targetId = scanner.nextLine();
        BankAccount targetAccount = accounts.get(targetId);

        System.out.print("Nhập số tiền cần chuyển: ");
        try {
            double transferAmount = Double.parseDouble(scanner.nextLine());
            account.transfer(targetAccount, transferAmount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
