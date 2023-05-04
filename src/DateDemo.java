import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DateDemo {


    public  static void main(String args[]) throws IOException, ParseException {
        System.out.println("asd");
        Date date = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        System.out.println(date);

        Date date1 = new Date();
        System.out.println(date1);
        //System.out.println(date1-date);

        LocalDate now = LocalDate.now();

        LocalDate sixDaysBehind = now.plusDays(6);

        Period period = Period.between(now, sixDaysBehind);
        System.out.println(period.getDays());

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse("06/24/2017");
        Date secondDate = sdf.parse("06/21/2017");

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		 Map<String, String> map = new HashMap<>();
		 map.put(null, null);
		 map.put(null, "");
		 Set<String> test = new HashSet<>();
		 test.add(null);
		 System.out.println(test);
		 System.out.println(map);
        System.out.println(diff);

        String pattern = "###,###.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String format = decimalFormat.format(88889.100);
        System.out.println(format);

        double val = 0.100;

        final String asd = new DecimalFormat("###,##0.00",
                new DecimalFormatSymbols(new Locale("pt", "BR"))).format(val);

        System.out.println(asd);
    }
}
