package ScannerAssignment;
import java.util.Scanner;
public class Greeting implements ScannerFactory{
    public Greeting() {

    }

    public void sayHi() {

        System.out.println("What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name);
    }


}
