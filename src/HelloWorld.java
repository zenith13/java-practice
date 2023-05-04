//import org.apache.commons.collections.CollectionUtils;
//
//import java.text.DecimalFormat;
//import java.time.ZonedDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//public class HelloWorld {
//
//    private static final String DELIMITER_SEMI_COLON = ";";
//    private static final String JSESSION_ID = "jsessionid=";
////Euler1
//    public  static void main(String args[]) {
//        int sum=0;
//        for(int i=0 ; i<1000 ; i++)
//        {
//            if(i%3 == 0 || i%5==0){
//                sum = sum +i;
//            }
//        }
//        System.out.println(sum);
//
//        //Euler2
//        List<Integer> fibonacci = new ArrayList<>();
//        fibonacci.add(1);
//        fibonacci.add(2);
//        for(int i=2 ; fibonacci.get(i-1)< 4000000; i++)
//        {
//            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
//        }
//        int sumFibonacci=0;
//        for(Integer x : fibonacci)
//        {
//            if(x % 2 == 0)
//            {
//                sumFibonacci+=x;
//            }
//        }
//        System.out.println(sumFibonacci);
//
//        //Euler3
//        int n = 316;
//        while (n%2==0)
//        {
//            System.out.print(2 + " ");
//            n /= 2;
//        }
//        System.out.println(n);
//
//        //LIST
//
//        List<String> test = new ArrayList<>();
//        //1201206
//        for(int i= 0 ; i< 15172478 ; i++ )
//        {
//            test.add("hellp");
//        }
//        List<String> newList = new ArrayList<>();
//
//        final List<List<String>> allResultsBatch = Lists.partition(test, 5000);
//        for (List<String> list : allResultsBatch) {
//            list.stream().filter(s-> s.startsWith("h")).forEach(s-> {
//                newList.add(s);
//            });
//        }
//
//      //  System.out.println("FIRST");
//       // System.out.println(test);
//        System.out.println("SECOND");
//        System.out.println(newList);
//
//    }
//}
