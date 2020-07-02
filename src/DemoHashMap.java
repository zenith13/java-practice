import java.io.IOException;
import java.util.*;

public class DemoHashMap {

    public  static void main(String args[]) throws IOException
    {
        String s1 ="hello!";
        String s2 ="hello!";
        String s3 = "hello!".intern();
        String s4 = new String("hello!");
        String s5 = "lo!";
        System.out.println(s1.equals(s4));
        System.out.println(s1 == s4);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        Vehicle v1 = new Vehicle("", "");
        v1.setColor("a");
        Vehicle v2 = new Vehicle("", "");
        v2.setColor("a");
        System.out.println(v1.equals(v2));
        List<String> ll = new LinkedList<>();

    }
}
