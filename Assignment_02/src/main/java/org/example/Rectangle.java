package org.example;

public class Rectangle {
    //Các thuộc tính của class Rectangle
    private double width;
    private double height;
    private double area;
    private double perimeter;
    private boolean isSquare;

    //1. Khai báo không tham số: tạo hình vuông cạnh 1
    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }

    //2. Khai báo 1 tham số side: tạo hình vuông cạnh side
    public Rectangle(double side){
        this.width = side;
        this.height = side;
    }

    //3. Tham số width, height: tạo hình chữ nhật bình thường
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //4.Phần mở rộng: Nhận vào 1 object Rectangle khác để tạo bản sao
    //Giải thích: Nếu 2 constructor đều nhận vào 1 tham số double thì compiler sẽ không xác định được chính xác constructor nào để khởi chạy
    public Rectangle(Rectangle other){
        if (other != null){
            this.width = other.width;
            this.height = other.height;
        }
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

    //Phần mở rộng: Khai báo phương thức scale cho hình chữ nhật
    public void scale(double factor){
        if ( factor > 0 && width != height){
            this.width *= factor;
            this.height *= factor;
        }
        else {
            System.out.println("Giá trị nhập vào chưa hợp lệ");
        }
    }
}
