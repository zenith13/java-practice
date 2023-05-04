import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 * @author 002L1R744 on 22-06-2022
 */
public class StringSimpleDemo
{
    public static void main(String[] args)
    {

        System.out.println(String.format("%s_%s", "one", "two"));
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
        System.out.println(timeStamp);

        System.out.println(ZonedDateTime
                .now(ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern( "dd.MM.yyyy HH.mm.ss z" )));

        System.out.println(String.join(" - ", "04", null, "06"));

        StringJoiner joiner = new StringJoiner(",");
        joiner.add("01").add("02").add("03");
        System.out.println(joiner.toString()); // "01,02,03"

        String s1 = joiner.toString();
        System.out.println("1111111");
        System.out.println(StringUtils.substringBefore(s1, ","));

        try
        {
            Files.list(Paths.get("filePath"))
                    .filter(s -> s.toString().endsWith("_impexData.txt"))
                    .sorted()
                    .forEach(f -> {
                        System.out.println("hello");
                    });
        }
        catch (IOException e)
        {
            System.out.println("error");
        }
        System.out.println(Stream.of("a", "b", "c")
                .anyMatch("x"::equalsIgnoreCase));
    }



}
