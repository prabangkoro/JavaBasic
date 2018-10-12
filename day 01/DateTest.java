import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * DateTest
 */
public class DateTest {

    public static void main(String[] args) {
        Date starts = new Date();
        SimpleDateFormat fDate = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzzz");
        System.out.println("start date: " + starts.toString());
        System.out.println("start date formatted: " + fDate.format(starts));

        try {
            long start = System.currentTimeMillis();
            Thread.sleep(5 * 60 * 10);
            long end = System.currentTimeMillis();
            System.out.println("time sleep: " + (end - start));
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Exception~");
        }
    }
}