package org.example;

public class Book {
    //Các thuộc tính của class Book
    private String title;
    private String author;
    private double price;
    private boolean inStock;

    //Khai báo tham số
    public Book(String title, String author, double price,boolean inStock){
        this.title = title;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    //Khai báo phương thức in toàn bộ sách
    public void printInfo(){
        System.out.println("Title: " + title + "\n" + "Author: " + author + "\n" + "Price: " + String.format("%.3f", price) + " VND" + "\n" + "In stock: " + inStock);
    }

    //Khai báo phương thức giảm giá theo phần trăm
    public double applyDiscount(double percent){
        price = price - (price * percent / 100);
        return price;
    }
}
