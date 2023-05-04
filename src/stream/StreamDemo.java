package stream;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author 002L1R744 on 22-11-2022
 */
public class StreamDemo
{
    public static void main(String[] args)
    {



        List<String> ordered = new ArrayList<>();
        ordered.add("company");
        ordered.add("new");
        ordered.add("project");


        Set<String> test = new HashSet<>();

        ordered.retainAll(test);

        for (String s : ordered)
        {
            System.out.println(s);
        }

        //Map and Flat map
        CustomerData customerData = new CustomerData();
        customerData.setName("john");
        customerData.setNumbers(Arrays.asList("11", "22", "33"));

        CustomerData customerData1 = new CustomerData();
        customerData1.setName("wick");
        customerData1.setNumbers(Arrays.asList("44", "55", "66"));

        List<CustomerData> customers = new ArrayList<>();
        customers.add(customerData);
        customers.add(customerData1);

        final List<List<String>> nameList = customers.stream().map(s -> s.getNumbers()).collect(Collectors.toList());
        nameList.forEach(s-> System.out.println(s));
        final List<String> nameList1 = customers.stream().flatMap(s -> s.getNumbers().stream()).collect(Collectors.toList());
        nameList1.forEach(s-> System.out.println(s));


        int x = 10;
        int y = 12;
        String s = x>y ? print1() : print2();
        System.out.println(s);
    }

    private static String print1()
    {
       return "2";
    }

    private static String print2()
    {
        return "3";
    }
}
