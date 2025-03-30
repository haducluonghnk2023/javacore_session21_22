package Ex21.Ex07;

public class BankAccount {
    private double balance;
    private static final double MIN_BALANCE = 50000;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Lỗi: Số tiền rút vượt quá số dư!");
        }
        if (balance - amount < MIN_BALANCE) {
            throw new Exception("Lỗi: Tài khoản phải duy trì số dư tối thiểu 50.000 đồng");
        }
        balance -= amount;
        System.out.println("Rút tiền thành công! Số dư còn lại: " + balance + " đồng");
    }
}
