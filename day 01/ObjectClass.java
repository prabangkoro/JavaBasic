/**
 * Dog
 */
class Dog {
    String name;
    public static final String TYPE = "Doggo";

    public Dog() {
        this("Default");
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
/**
 * ObjectClass
 */
public class ObjectClass {
    String objectType;
    public ObjectClass() {
        this.objectType = "Object Class type";
    }
    public ObjectClass(String objectType) {
        this.objectType = objectType;
    }

    public static void main(String[] args) {
        Dog abc = new Dog();
        System.out.println("abc dog's name: " + abc.getName());
        Dog sdf = new Dog("hehe");
        System.out.println("sdf dog's name: " + sdf.getName());
        System.out.println("sdf dog's type: " + sdf.TYPE);
        ObjectClass aaa = new ObjectClass();
        System.out.println("aaa object type: " + aaa.objectType);
        ObjectClass bbb = new ObjectClass("New type");
        System.out.println("bbb object type: " + bbb.objectType);
        if (bbb instanceof ObjectClass) {
            System.out.println("bbb instance of ObjectClass.");  
        }
    }
}