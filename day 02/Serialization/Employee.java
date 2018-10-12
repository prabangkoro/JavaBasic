import java.io.*;

public class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    static final long serialVersionUID = 0;
    
    public void mailCheck() {
       System.out.println("Mailing a check to " + name + " " + address);
    }
 }