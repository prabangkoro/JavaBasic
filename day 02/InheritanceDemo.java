/**
 * Calculation
 */
class Calculation {
    int res;

    public void addition(int x, int y) {
        this.res = x + y;
        System.out.println("addition result: " + this.res);
    }

    public void substraction(int x, int y) {
        this.res = x - y;
        System.out.println("substraction result: " + this.res);
    }

    public Calculation() {
        this(10);
    }
    
    public Calculation(int val) {
        this.res = val;
        System.out.println("result default value: " + this.res);
    }
}

/**
 * InheritanceDemo
 */
public class InheritanceDemo extends Calculation {

    public InheritanceDemo() {
        super(20);
    }

    public void multiplication(int x, int y) {
        super.res = x * y;
        System.out.println("multiplication result: " + super.res);
    }

    public void subAddition(int x, int y) {
        super.addition(x, y);
    }

    public static void main(String[] args) {
        int zx = 10, xc = 20;
        InheritanceDemo asd = new InheritanceDemo();
        asd.addition(zx, xc);
        asd.substraction(zx, xc);
        asd.multiplication(zx, xc);
        asd.subAddition(zx, xc);
        if(asd instanceof Calculation)
            System.out.println("InheritanceDemo is instance of Calculation.");
    }
}