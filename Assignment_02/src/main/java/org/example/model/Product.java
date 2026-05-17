package org.example.model;

import org.example.util.ProductValidator;

public class Product {
    // Thuộc tính private
    private String productCode;
    private String name;
    private double price;
    private int quantity;
    private Category category; // Thuộc tính mở rộng
    private boolean isActive = false; // Thuộc tính mở rộng

    private static int counter = 1;
    private static int totalProducts = 0;
    private static double totalRevenue = 0;

    // Hàm dùng chung cho các Constructor
    private void initializeProductCode() {
        this.productCode = String.format("P-%04d", counter++);
        totalProducts++;
    }

    // Viết 3 constructor (overloading)
    public Product() {
        this.name = "Unknown";
        this.price = 0;
        this.quantity = 0;
        initializeProductCode();
    }

    public Product(String name, double price) {
        // nếu sai dữ liệu thì gán giá trị mặc định
        this.name = ProductValidator.isValidName(name) ? name : "Unknown";
        this.price = ProductValidator.isValidPrice(price) ? price : 0;
        this.quantity = 0;
        initializeProductCode();
    }

    public Product(String name, double price, int quantity) {
        this.name = ProductValidator.isValidName(name) ? name : "Unknown";
        this.price = ProductValidator.isValidPrice(price) ? price : 0;
        this.quantity = ProductValidator.isValidQuantity(quantity) ? quantity : 0;
        initializeProductCode();
    }

    //Getter và Setter
    public String getProductCode() { return productCode; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public Category getCategory() { return category; }
    public boolean isActive() { return isActive; }

    public void setName(String name) {
        if (ProductValidator.isValidName(name)) {
            this.name = name;
        }
    }

    public void setPrice(double price) {
        if (ProductValidator.isValidPrice(price)) {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (ProductValidator.isValidQuantity(quantity)) {
            this.quantity = quantity;
        }
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    //Phương thức instance
    public void sell(int amount) {
        if (isActive) {
            System.out.println("Loi: San pham nay da bi huy ban!");
            return;
        }
        if (amount > 0 && amount <= this.quantity) {
            this.quantity -= amount;
            totalRevenue += amount * this.price;
            System.out.println("Da ban " + amount + " san pham " + this.name);
        } else {
            System.out.println("Loi: So luong ban khong hop le hoac khong du hang ton kho!");
        }
    }

    public void restock(int amount) {
        if (amount > 0) {
            this.quantity += amount;
            System.out.println("Da nhap them " + amount + " san pham " + this.name);
        }
    }

    public void displayInfo() {
        String cateName = (category != null) ? category.getCategoryName() : "No Category";
        String status = isActive ? " (Da huy ban)" : "";
        System.out.printf("[%s]%s - %s - Gia: %.0f - Ton: %d - Danh muc: %s\n",
                productCode, status, name, price, quantity, cateName);
    }

    //Phương thức static
    public static int getTotalProducts() { return totalProducts; }
    public static double getTotalRevenue() { return totalRevenue; }

    public static String getStoreReport() {
        return String.format("--- BAO CAO CUA HANG ---\nTong so san pham hien co: %d\nTong doanh thu: %.0f\n------------------------",
                totalProducts, totalRevenue);
    }

    //PHẦN MỞ RỘNG
    // Tăng phần trăm giảm giá cá nhân
    public void applyPromotion(double discountPercent) {
        if (discountPercent > 0 && discountPercent <= 100) {
            this.price -= this.price * (discountPercent / 100.0);
        }
    }

    // Áp dụng giảm giá đồng loạt cho mảng sản phẩm
    public static void applyGlobalPromotion(Product[] products, double discountPercent) {
        if (products != null && discountPercent > 0 && discountPercent <= 100) {
            for (Product p : products) {
                if (p != null) {
                    p.applyPromotion(discountPercent);
                }
            }
        }
    }

    //PHẦN MỞ RỘNG:
    //Khi huỷ một sản phẩm, totalProducts không nên giảm. Vì `totalProducts` đại diện cho tổng số lượng mẫu/mã hàng
    // hệ thống đã từng quản lý và vận hành. Nếu giảm đi, dữ liệu báo cáo lịch sử, hóa đơn cũ liên quan đến mã hàng này sẽ bị lệch logic hệ thống.
    // sử dụng một biến`isActive` để đánh dấu trạng thái ngừng kinh doanh và chặn các hành vi mua bán.
    public void discontinue() {
        if (!this.isActive) {
            this.isActive = true;
            totalProducts--;
            System.out.println("San pham " + this.name + " da duoc chuyen sang trang thai dung ban.");
        }
    }
}
