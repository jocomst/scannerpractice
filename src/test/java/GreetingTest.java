import ScannerAssignment.Greeting;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @DisplayName("Say hi to name input")
    @Test
    void sayHi() {
        assertEquals("Hi Ash Ketchup!", Greeting.sayHi("Ash Ketchup"));
    }
}