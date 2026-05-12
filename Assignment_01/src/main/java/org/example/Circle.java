package org.example;

public class Circle {
    //Các thuộc tính của class Rectangle
    private double radius;
    private double area;
    private double circumFerence;

    //Khai báo tham số
    public Circle(double radius){
        this.radius = radius;
    }

    //Khai báo phương thức tính chu vi hình chữ nhật
    public double circumFerence(){
        circumFerence = 2 * Math.PI * radius;
        return circumFerence;
    }

    //Khai báo phương thức tính diện tích hình chữ nhật
    public double area(){
        area = Math.PI * Math.pow(radius,2);
        return area;
    }
}
