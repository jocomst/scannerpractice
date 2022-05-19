package ScannerAssignment;

import org.w3c.dom.ls.LSOutput;

public class VariableInputs implements ScannerFactory {
    public VariableInputs() {}

    public void varInputs() {
        System.out.println("Enter a string of text:");
        String text = scanner.nextLine();
        System.out.println("Enter an integer:");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a double:");
        Double dub = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value:");
        Boolean boop = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + text);
        System.out.println("Your integer is " + num);
        System.out.println("Your double is " + dub);
        System.out.println("Your boolean is " + boop);
    }
}
