package multiple.inheritance.demo;

/**
 * @author 002L1R744 on 09-03-2023
 */
public class DemoClass implements InterfaceA, InterfaceB
{

    @Override
    public void show()
    {
        System.out.println("hello");
    }

    @Override
    public void printMessage()
    {
        InterfaceB.super.printMessage();
    }

    public static void main(String[] args)
    {
        DemoClass d = new DemoClass();
        d.show();
        d.printMessage();
    }
}
