package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Bài 1: Class Book
        //Khởi tạo giá trị
        Book b1 = new Book("Dac Nhan Tam","Dale Carnegie", 76.000, true);
        Book b2 = new Book("Nha Gia Kim","Paulo Coelho", 106.000, true);
        Book b3 = new Book("Doi ngan dung ngu dai","Robin Sharma", 89.000, false);

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
        //Khởi tạo giá trị
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(25,25);

        //Tính diện tích, chu vi và kiểm tra hình vuông
        r1.perimeter();
        r1.area();
        r1.isSquare();

        r2.perimeter();
        r2.area();
        r2.isSquare();

        //In giá trị
        System.out.println("\n************************");
        System.out.println("Bai 2: Class Rectangle");
        System.out.println("**************************");
        r1.printInfo();
        System.out.println("-------------------");
        r2.printInfo();
        System.out.println("----------------");

        //Bài 3: Class Circle
        //Khởi tạo giá trị
        Circle[] circles = {
                new Circle(16),
                new Circle(31),
                new Circle(54),
                new Circle(62),
                new Circle(14),
                new Circle(78),
        };

        //Tính tổng diện tích
        double sumArea = 0;
        for (int i = 0; i < circles.length; i++){
            sumArea += circles[i].area();
        }

        //In tổng diện tích và chu vi
        System.out.println("\n************************");
        System.out.println("Bai 3: Class Circle");
        System.out.println("**************************");
        System.out.println("Total area is: " + String.format("%,.3f%n", sumArea));
        System.out.println("----------------");
    }
}