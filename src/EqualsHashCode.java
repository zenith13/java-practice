import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class EqualsHashCode {

    public  static void main(String args[]) throws IOException {

        Vehicle v1 = new Vehicle("red", "sedan");
        Vehicle v2 = new Vehicle("red", "sedan");
//        v1.setColor("red");
//        Vehicle v2 = v1;

        String s1 = new String("111");
        String s2 = new String("111");


        System.out.println(v1.equals(v2));
        System.out.println(v1.hashCode());
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        System.out.println(s1.equals(s2));

        Set<Vehicle> vehicles = new HashSet<>();
        vehicles.add(v1);
        vehicles.add(v2);


        System.out.println(vehicles.size());
    }
}
