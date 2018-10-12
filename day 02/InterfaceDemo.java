/**
 * Business
 */
interface Business {
    final int NO_OF_BUSINESS = 10;
    public void showProcess();
    public void runProcess();
}

/**
 * DevelopingBusiness
 */
interface DevelopingBusiness extends Business {

    public void showRate();
}

/**
 * ECommerce
 */
class ECommerce implements Business {

    public void showProcess() {
        System.out.println("showing process...");
    }

    public void runProcess() {
        System.out.println("running process ...");
    }

    public void getNoOfBusiness() {
        System.out.println("no of business: " + this.NO_OF_BUSINESS);
    }
}

/**
 * StartUp
 */
class StartUp implements DevelopingBusiness {

    public void showProcess() {
        System.out.println("showing process...");
    }

    public void runProcess() {
        System.out.println("running process ...");
    }

    public void showRate() {
        System.out.println("current rate: " + 100);
    }

    public void getNoOfBusiness() {
        System.out.println("no of business: " + this.NO_OF_BUSINESS);
    }
}

/**
 * InterfaceDemo
 */
public class InterfaceDemo {

    public static void main(String[] args) {
        ECommerce e = new ECommerce();
        e.showProcess();
        e.runProcess();
        e.getNoOfBusiness();
        StartUp s = new StartUp();
        s.showRate();
        s.getNoOfBusiness();
    }
}