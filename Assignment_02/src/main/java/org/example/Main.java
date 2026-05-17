package org.example;

import org.example.model.Category;
import org.example.model.Product;

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

        //Bài 4: Class Employee
        //1. Khởi tạo giá trị
        Employee e1 = new Employee("Tran Van A",3000000);
        Employee e2 = new Employee("Nguyen Van B",4000000);
        Employee e3 = new Employee("Nguyen Van C",5000000);

        //In giá trị
        System.out.println("\n************************");
        System.out.println("Bai 4: Class Employee");
        System.out.println("**************************");
        e1.printInfo();
        System.out.println("-------------------");
        e2.printInfo();
        System.out.println("-------------------");
        e3.printInfo();
        System.out.println("-------------------");
        //Tổng số nhân viên
        System.out.println("Tổng số nhân viên: " + Employee.getEmployeeCount());
        System.out.println("-------------------");
        //Tổng lương
        System.out.println("Tổng lương: " + Employee.getTotalSalary());
        System.out.println("-------------------");
        //Lương trung bình
        System.out.println("Lương trung bình: " + Employee.getAverageCount());
        System.out.println("-------------------");


        System.out.println("Cập nhật tên công ty, bonus lương và cập nhật lương nhân viên");
        //Thay đổi lương 1 nhân viên
        e2.setSalary(10000000);
        //Phần mở rộng: Đổi tên công ty
        Employee.changeCompanyName("Tesla");
        e3.printInfo();
        //Phần mở rộng: thêm bonus vào lương
        e1.raiseSalary(10);
        //Tổng lương sau khi thay đổi lương 1 nhân viên
        System.out.println("Tổng lương: " + Employee.getTotalSalary());
        System.out.println("-------------------");
        //Lương trung bình sau khi thay đổi lương 1 nhân viên
        System.out.println("Lương trung bình: " + Employee.getAverageCount());
        System.out.println("-------------------");

        //Bài 5: Class Product + Package
        //1. Khởi tạo giá trị
        Product p1 = new Product(); // Unknown
        Product p2 = new Product("Dien thoai iPhone", 20000000); // 2 tham số
        Product p3 = new Product("Laptop Asus", 15000000, 10); // 3 tham số
        Product p4 = new Product("Sach Lap Trinh Java", 150000, 50); // 3 tham số

        // Tạo danh mục sản phẩm (Phần mở rộng)
        Category electronics = new Category("CAT01", "Dien tu");
        Category books = new Category("CAT02", "Sach");

        // Gán danh mục cho sản phẩm
        p2.setCategory(electronics);
        p3.setCategory(electronics);
        p4.setCategory(books);

        System.out.println("Thong tin san pham ban dau");
        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
        p4.displayInfo();

        System.out.println("\nHoat dong kho va ban hang");
        p2.restock(5); // Nhập thêm 5 điện thoại
        p2.sell(2);    // Bán 2 điện thoại -> Doanh thu: 40,000,000
        p3.sell(3);    // Bán 3 laptop -> Doanh thu: 45,000,000
        p4.sell(10);   // Bán 10 cuốn sách -> Doanh thu: 1,500,000

        System.out.println("\n" + Product.getStoreReport());

        System.out.println("\nAp dung khuyen mai toan bo mat hang (Giam gia 10% dong loat)");
        Product[] storeProducts = {p2, p3, p4};
        Product.applyGlobalPromotion(storeProducts, 10);
        p2.displayInfo();
        p3.displayInfo();

        System.out.println("\nThu nghiem tinh nang dung ban (Discontinue)");
        p4.discontinue();
        p4.displayInfo();
        p4.sell(5); // Bán hàng sau khi hủy kinh doanh

        System.out.println("\nTong so san pham con lai sau khi xoa/huy: " + Product.getTotalProducts());
    }
}