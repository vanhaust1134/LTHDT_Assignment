package org.example;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private static int employeeCount = 0;
    private static int nextId = 1000;
    public static String companyName = "TechCorp";
    private static double totalSalary = 0;

    //Khai báo constructor
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        id = nextId++;
        employeeCount++;
        totalSalary += salary;
    }

    //Khai báo getter setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    //Set lương và cập nhật tổng lương
    public void setSalary(double salary) {
        totalSalary += (salary - this.salary);
        this.salary = salary;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static String getTotalSalary() {
        return String.format("%,.0f%n", totalSalary);
    }

    //Phương thức in thông tin
    public void printInfo(){
        System.out.println("ID: " + id + "\n" + "Tên công ty :" + companyName + "\n"  + "Ho va ten :" + name + "\n" + "Luong co ban: " + String.format("%,.0f%n", salary));
    }

    //Phương thức tính lương trung bình
    //Phần mở rộng: Giải thích getAverageCount() vẫn chạy được, vì đây là phương thức static nên gọi được qua lớp Employee mà không cần object
    public static String getAverageCount() {
        if (employeeCount == 0) {
            System.out.println("Vui lòng cập nhật ít nhất 1 thông tin nhân viên");
        }
        return String.format("%,.0f%n", totalSalary / employeeCount);
    }

    //Phần mở rộng: Phương thức static đổi tên công ty
    public static void changeCompanyName(String newName) {
        companyName = newName;
    }

    //Phần mở rộng: Phương thức instance tăng lương theo phần trăm
    public void raiseSalary(double percent) {
        if (percent > 0) {
            double salaryIncrease = this.salary * (percent / 100.0);
            this.salary += salaryIncrease;
            totalSalary += salaryIncrease;
        }
    }
}
