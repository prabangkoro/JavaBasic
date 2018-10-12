import java.io.*;
/**
 * ReadConsole
 */
public class ReadConsole {

    public static void main(String[] args) throws IOException {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            System.out.println("enter char until 'q': ");
            char c;
            do {
                c = (char) cin.read();
                System.out.println(c);
            } while (c != 'q');
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Exception ~");
        } finally {
            if(cin != null) {
                cin.close();
            }
        }
    }
}