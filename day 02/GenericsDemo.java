/**
 * GenericClass <T>
 */
class GenericClass <T> {

    private T elm;

    public void set(T x) {
        this.elm = x;
    }

    public T get() {
        return elm;
    }

    public void repeatedShow(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(this.elm);
        }
    }
}

/**
 * GenericsDemo
 */
public class GenericsDemo {

    public static <T extends Comparable<T>> T maximum(T x, T y) {
        T max = x;
        if (y.compareTo(x) > 0) {
            max = y;
        }
        return max;
    }

    public static <T> void showElementMember(T[] els) {
        for(T el : els) {
            System.out.println("element member: " + el);
        }
    }

    public static void main(String[] args) {
        Integer[] asd = {10, 20, 49, 13, 3};
        Double[] sdf = {0.0, 1.0, 1.3, 4.3, 95.3};
        Character[] dfg = {'h', 'e', 'l', 'l'};
        showElementMember(asd);
        showElementMember(sdf);
        showElementMember(dfg);

        System.out.println("max: " + maximum(1, 3));
        System.out.println("max: " + maximum(12.3, .4));
        System.out.println("max: " + maximum("babang", "hehe"));

        GenericClass<Integer> fff = new GenericClass<Integer>();
        fff.set(10);
        System.out.println("fff element: " + fff.get());
        GenericClass<String> aaa = new GenericClass<String>();
        aaa.set("Babang hello!");
        System.out.println(aaa.get());
        aaa.repeatedShow(10);
    }
}