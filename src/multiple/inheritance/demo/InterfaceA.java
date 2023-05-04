package multiple.inheritance.demo;

/**
 * @author 002L1R744 on 09-03-2023
 */
public interface InterfaceA
{
    void show();

    default void printMessage(){
        System.out.println("from A");
    }
}
