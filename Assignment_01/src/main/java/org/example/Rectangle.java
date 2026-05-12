package org.example;

public class Rectangle {
    //Các thuộc tính của class Rectangle
    private double width;
    private double height;
    private double area;
    private double perimeter;
    private boolean isSquare;

    //Khai báo tham số
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //Khai báo phương thức xuất thông tin
    public void printInfo(){
        System.out.println("Width: " + width + "\n" + "Height: " + height + "\n" + "Perimeter: " + perimeter + "\n" + "Area: " + area + "\n" + "Is square: " + isSquare);
    }

    //Khai báo phương thức tính chu vi hình chữ nhật
    public double perimeter(){
        perimeter = (width + height) * 2;
        return perimeter;
    }

    //Khai báo phương thức tính diện tích hình chữ nhật
    public double area(){
        area = width * height;
        return area;
    }

    //Khai báo phương thức kiểm tra hình vuông
    public boolean isSquare(){
        if ( width == height){
            isSquare = true;
        }
        else {
            isSquare = false;
        }
        return isSquare;
    }
}
