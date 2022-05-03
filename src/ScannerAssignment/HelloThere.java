package ScannerAssignment;



public class HelloThere implements ScannerFactory {

    public HelloThere() {}

    public void miniConvo() {
        System.out.println("Hello there! How are you doing today?");
        String answer1 = scanner.nextLine();
        System.out.println(answer1);
        System.out.println("Wow - Interesting. Tell me more about yourself!");
        String answer2 = scanner.nextLine();
        System.out.println(answer2);
        System.out.println("Nice chatting with you! Goodbye!");
    }

}
