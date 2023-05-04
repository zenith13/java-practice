package collections.demo;

import java.util.HashMap;
import java.util.Optional;
import java.util.TreeMap;

/**
 * @author 002L1R744 on 17-04-2023
 */
public class CollectionsDemo
{

    public static void main(String[] args)
    {
        //TreeMAp

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("as", "1");

        System.out.println(treeMap.firstKey());

        HashMap<String, String> testMap = new HashMap<>();
        testMap.put("1", "1");
        testMap.put("1", "2");
        System.out.println(testMap.get("1"));

        String text = "Text present11";

        System.out.println("Using orElseGet:");
        String defaultText
                = Optional.ofNullable(text).orElseGet(CollectionsDemo::getMyDefault);
        System.out.println(defaultText);
        System.out.println("Using orElse:");
        defaultText = Optional.ofNullable(text).orElse(getMyDefault());

        System.out.println(defaultText);

    }

    public static String getMyDefault() {
        System.out.println("Getting Default Value");
        return "Default Value";
    }
}
