package org.example;

public class Book {
    //Các thuộc tính của class Book
    String title;
    String author;
    int year;
    double price;

    //1.Khai báo constructor mặc định
    public Book(){
        this.title = "Unknown";
        this.author = "Unknown";
        this.year = 2000;
        this.price = 0;
    }

    //2.Khai báo constructor có 4 tham số
    public Book(String title, String author, int year, double price){
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    //3.Phần mở rộng: Khai báo constructor có 2 tham số
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.year = 2026;
        this.price = 100000;
    }

    //Khai báo phương thức in toàn bộ sách
    public void printInfo(){
        System.out.println("Sách: " + title + "\n" + "Tác giả: " + author + "\n" + "Năm: " + year + " VND" + "\n" + "Giá: " + String.format("%.3f", price));
    }

    //Khai báo phương thức giảm giá theo phần trăm
    public double applyDiscount(double percent){
        price = price - (price * percent / 100);
        return price;
    }
}
