package Ex21.Ex09;

public class BankAccount {
    private String accountId;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Lỗi: Số tiền gửi phải lớn hơn 0!");
        }
        balance += amount;
        System.out.println("Gửi tiền thành công! Số dư mới: " + balance);
    }
    public void withdraw(double amount)throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Lỗi: Số tiền rút phải lớn hơn 0!");
        }
        if (amount > balance) {
            throw new InvalidTransactionException("Lỗi: Số dư không đủ!");
        }
        balance -= amount;
        System.out.println("Rút tiền thành công! Số dư còn lại: " + balance);
    }
    public void transfer(BankAccount destination, double amount) throws InvalidTransactionException {
        if (destination == null) {
            throw new InvalidTransactionException("Lỗi: Tài khoản nhận không tồn tại!");
        }
        this.withdraw(amount);
        destination.deposit(amount);
        System.out.println("Chuyển tiền thành công! Số dư còn lại: " + balance);
    }
}
