import java.io.*;
/**
 * SerializationDemo
 */
public class SerializationDemo {
    public static void whenSerializingAndDeserializing_ThenObjectIsTheSame() throws IOException, ClassNotFoundException { 
        Person person = new Person();
        person.setAge(20);
        person.setName("Joe");
         
        FileOutputStream fileOutputStream
          = new FileOutputStream("yourfile.txt");
        ObjectOutputStream objectOutputStream 
          = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();
         
        FileInputStream fileInputStream
          = new FileInputStream("yourfile.txt");
        ObjectInputStream objectInputStream
          = new ObjectInputStream(fileInputStream);
        Person p2 = (Person) objectInputStream.readObject();
        objectInputStream.close(); 

        System.out.println("Name: " + p2.getName());
        System.out.println("Age: " + p2.getAge());
      
        // assertTrue(p2.getAge() == person.getAge());
        // assertTrue(p2.getName().equals(person.getName()));
    }
    public static void main(String[] args) {
        try {
            whenSerializingAndDeserializing_ThenObjectIsTheSame();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Exception");
        }
    }
}