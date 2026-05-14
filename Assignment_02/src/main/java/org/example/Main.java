package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Bài 1: Class Book
        //1. Khởi tạo giá trị mặc định
        Book b1 = new Book();
        //2. Khởi tạo 4 tham số
        Book b2 = new Book("Nha Gia Kim","Paulo Coelho", 2015, 106.000);
        //3. Phần mở rộng: Khởi tạo 2 tham số
        Book b3 = new Book("Doi ngan dung ngu dai","Robin Sharma");

        //Gán Discount
        b1.applyDiscount(10);
        b2.applyDiscount(10);
        b3.applyDiscount(10);

        //In giá trị
        System.out.println("*******************");
        System.out.println("Bai 1: Class Book");
        System.out.println("*******************");
        b1.printInfo();
        System.out.println("-------------------");
        b2.printInfo();
        System.out.println("----------------");
        b3.printInfo();
        System.out.println("----------------");

        //Bài 2: Class Rectangle
        //1. Khởi tạo giá trị hình vuông cạnh 1
        Rectangle r1 = new Rectangle();
        //2. Khởi tạo
        Rectangle r2 = new Rectangle(15);
        //3. Khởi tạo hình chữ nhật bình thường
        Rectangle r3 = new Rectangle(35,51);

        //Tính diện tích, chu vi và kiểm tra hình vuông
        r1.perimeter();
        r1.area();
        r1.isSquare();

        r2.perimeter();
        r2.area();
        r2.isSquare();

        r3.perimeter();
        r3.area();
        r3.isSquare();

        //In giá trị
        System.out.println("\n************************");
        System.out.println("Bai 2: Class Rectangle");
        System.out.println("**************************");
        r1.printInfo();
        System.out.println("-------------------");
        r2.printInfo();
        System.out.println("-------------------");
        r3.printInfo();
        System.out.println("----------------");

        //Phần mở rộng
        System.out.println("Phần mở rộng");
        r3.scale(50);
        r3.printInfo();
        System.out.println("----------------");

        //Bài 3: Class BankAccount
        //1. Khởi tạo giá trị
        BankAccount ba1 = new BankAccount(123456789,"Tran Van A",1000000);
        BankAccount ba2 = new BankAccount(987654321,"Nguyen Van B",2000000);

        //Thực hiện chuyển và rút tiền
        ba1.deposit(200000);
        ba1.withdraw(300000);
        ba2.deposit(300000);
        ba2.withdraw(400000);

        //In giá trị
        System.out.println("\n************************");
        System.out.println("Bai 3: Class BankAccount");
        System.out.println("**************************");
        ba1.printInfo();
        System.out.println("-------------------");
        ba2.printInfo();
        System.out.println("-------------------");

        //Thử lỗi nạp số âm và rút tiền vượt quá số dư
        ba1.deposit(-500000);
        ba2.withdraw(3000000);
        System.out.println("-------------------");

        //Phần mở rộng: Thực hiện chuyển tiền và hiển thị số dư
        ba2.transfer(ba1,700000);
        ba2.printInfo();
    }
}