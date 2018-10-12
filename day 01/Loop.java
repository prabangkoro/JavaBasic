import java.util.Arrays;
/**
 * Loop
 */
public class Loop {
    public static void listArray(int[] arrs) {
        for(int arr : arrs) {
            System.out.println("array member: " + arr);
        }
    }

    public static void main(String[] args) {
        String [] fruits = {"banana", "apple", "water melon"};
        for(String fruit : fruits) {
            System.out.println("a fruit name: " + fruit);
        }
        Integer [] ips = {10, 128, 135};
        for(Integer ip : ips) {
            System.out.println("an ip address: " + ip);
        }
        System.out.println("random number: " + Math.random());
        String abc = "abc";
        String def = "def";
        System.out.println("concat: " + abc + def);
        System.out.println("has of abc: " + abc.hashCode());
        // array
        int[] score = {10, 20, 30, 40};
        listArray(score);
        listArray(new int[]{50, 60, 70, 80, 90, 100});
        int[] dataxs = new int[3];
        Arrays.fill(dataxs, 10);
        for(int datax : dataxs) {
            System.out.println(datax);
        }
    }
}