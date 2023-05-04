import org.json.JSONException;
import org.json.JSONObject;

import java.util.Iterator;

/**
 * @author 002L1R744 on 28-03-2023
 */
public class DemoJson
{
    public static void main(String[] args) throws JSONException
    {

        JSONObject s = new JSONObject("{\"name\":\"John\", \"age\":30, \"car\":''}");
        final Iterator keys = s.keys();
        while (keys.hasNext())
        {
            System.out.println(keys.next());
        }
        final Object asd = s.get("name");
        System.out.println(asd);
    }
}
