/**
 * MyEnum
 */
class MyEnum {

    enum EnumAge {OLD, YOUNG, BABY}
    EnumAge age;
}

/**
 * new
 */
public class New {

    public static void main(String[] args) {
        System.out.println("hello world... ");
        MyEnum abc = new MyEnum();
        abc.age = MyEnum.EnumAge.BABY;
        System.out.println("abc age: " + abc.age);
    }
}