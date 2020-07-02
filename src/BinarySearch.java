import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;

public class BinarySearch {

    public  static void main(String args[]) throws IOException, ParseException {

        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20,22};
        System.out.println(Arrays.toString(Arrays.copyOfRange(numbers, 1, numbers.length)));
        System.out.println(element(numbers, 10));
        System.out.println(numbers.length/2);


    }

    private static int element(int [] array, int numberToFind)
    {
        int[] array1 = Arrays.copyOfRange(array, 0, array.length/2);
        if(numberToFind > array[array.length/2]){
            return 100;
        }
        return 404;
    }
}
