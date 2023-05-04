
import java.text.NumberFormat;

/**
 * @author 002L1R744 on 31-07-2022
 */
public class BirthYear
{

    public void call(Object o)
    {
        System.out.println("1");
    }

    public void call(Integer o)
    {
        System.out.println("2");
    }
}

/**
 * @author 002L1R744 on 23-08-2022
 */
class Main
{
    public static void main(String[] args)
    {
            System.out.println("h");
       // NumberFormat.getInstance(commerceCommonI18NService.getCurrentLocale()).format(Double.valueOf(number))
      //  System.out.println(StringUtils.isNotBlank(null));
        final String asd = NumberFormat.getInstance().format(Double.valueOf("345"));
        System.out.println(asd);
        if(null instanceof String)
        {
            System.out.println("y");
        }
        BirthYear birthYear = new BirthYear();
        birthYear.call(null);
    }
}

