import java.io.*;

/**
 * Employee
 */
public class Employee {

    String name;
    int age;
    String position;
    int salary;

    public Employee() {
        this.name = "David";
        this.age = 22;
        this.position = "SDE";
        this.salary = 4500;
    }

    public Employee(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void printEmployee() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Position: " + this.position);
        System.out.println("Salary: " + this.salary);
    }
}