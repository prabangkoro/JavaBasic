/**
 * Salary
 */
abstract class Salary {

    int salary;
    public Salary() {
        this.salary = 1000;
    }    

    public void showSalary() {
        System.out.println("salary: " + this.salary);
    }

    abstract int getSalary();
}

/**
 * Employee
 */
class Employee extends Salary {

    int getSalary() {
        return super.salary;
    }
}

/**
 * AbstractionDemo
 */
public class AbstractionDemo {

    public static void main(String[] args) {
        Employee asd = new Employee();
        asd.showSalary();
        System.out.println("employee's salary: " + asd.getSalary());
    }
}