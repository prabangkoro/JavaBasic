class Animal {
    public void move() {
        System.out.println("animal can move");
    }

    public Animal() {
        System.out.println("animal constructor");        
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("dog can move");
    }

    public Dog() {
        System.out.println("dog constructor");
    }
}

/**
 * OverridingDemo
 */
public class OverridingDemo {

    public static void main(String[] args) {
        Animal anm = new Animal();
        Dog doggo = new Dog();
        anm.move();
        doggo.move();
    }
}