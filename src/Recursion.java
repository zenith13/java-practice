public class Recursion {

	private static String ASD;
    public static void main(String args[]){
        for(int i =0;i<5;i++)
        {

            System.out.println("hello"+ASD+"1");
        }

        //callInternal("hello1", 5);
    }

    private static String callInternal(String s, int n){
       return callInternal("s", n-1);
    }
}
