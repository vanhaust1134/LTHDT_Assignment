package org.example;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    //Khai báo constructor
    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if(balance < 0){
            this.balance = 0;
            System.out.println("Số dư không được nhỏ hơn 0");
        }
        else {
            this.balance = balance;
        }
    }

    //Khai báo getter
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //Khai báo chỉ cho set thông tin tên chủ tài khoản,
    //Giải thích: không set số tài khoản (vì số tài khoản là định danh duy nhất và 1 lần không cho phép chỉnh sửa
    // không set số dư (vì số dư là đại diện cho tiền mặt thực tế được trao đổi xuyên suốt vòng đời tài khoản qua các giao dịch))
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null &&  !accountHolderName.trim().isEmpty()){
            this.accountHolderName = accountHolderName;
        }
        else {
            System.out.println("Tên tài khoản không hợp lệ");
        }
    }

    //Khai báo phương thức hiển thị thông tin
    public void printInfo(){
        System.out.println("STK: " + accountNumber + "\n" + "Tên chủ TK: " + accountHolderName + "\n" + "Balance: " + String.format("%,.3f%n", balance) );
    }

    //Khai báo phương thức nạp tiền
    public double deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
        else {
            System.out.println("Số tiền nạp vào phải lớn hơn 0");
        }
        return balance;
    }

    //Khai báo phương thức rút tiền
    public double withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
        }
        else {
            System.out.println("Tài khoản không đủ để thực hiện thanh toán");
        }
        return balance;
    }

    //Phần mở rộng: Khai báo phương thức chuyển khoản
    public void transfer(BankAccount other, double amount) {
        // 1. Kiểm tra số tiền chuyển phải hợp lệ (lớn hơn 0)
        if (amount <= 0) {
            System.out.println("Lỗi: Số tiền chuyển phải lớn hơn 0!");
            return;
        }

        // 2. Kiểm tra tài khoản có đủ số dư hay không
        if (this.balance < amount) {
            System.out.println("Lỗi: Số dư tài khoản không đủ để thực hiện giao dịch!");
            return;
        }

        // 3. Kiểm tra tài khoản đích có tồn tại hay không
        if (other == null) {
            System.out.println("Lỗi: Tài khoản đích không tồn tại!");
            return;
        }

        // 4. Thực hiện trừ tiền tài khoản này và cộng tiền vào tài khoản khác
        this.balance -= amount;      // Giảm số dư tài khoản gửi
        other.balance += amount;     // Tăng số dư tài khoản nhận

        System.out.println("Chuyển khoản thành công " + amount + " đến tài khoản " + other.getAccountNumber());
    }
}
