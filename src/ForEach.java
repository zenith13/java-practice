import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForEach {

    public  static void main(String args[]) throws IOException {

        List<String> data = new ArrayList<>();
        List<String> data1 = new ArrayList<>();
        for(int i=0; i <1000000; i++){
            data.add("apple");
        }
        long startTime = System.currentTimeMillis();
        for(String s : data){
            if(s.startsWith("A")){
                data1.add(s);
            }

        }
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("F--"+totalTime);

        long startTime1 = System.currentTimeMillis();
        data.stream().filter(s-> (s.startsWith("a"))).forEach(s-> {
            data1.add(s);
        });
        long endTime1   = System.currentTimeMillis();
        long totalTime1 = endTime1 - startTime1;
        System.out.println("F--"+totalTime1);

        data.stream().filter(s-> (s.startsWith("a"))).forEach(s-> {
            data1.add(s);
        });

        LinkedList<String> test = new LinkedList<>();
        test.add("asd");

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("red", "sedan"));

        vehicles.stream().forEach(v -> {
        int count = 7;
        count++;
        });
    }

    public String getValue(List<Vehicle> vehicleList)
    {
        return vehicleList.toString();
    }
}
