import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    
    @Test
    public void testAddition() {
        int num1 = 10;
        int num2 = 20;
        int expectedSum = 30;

        assertEquals(expectedSum, num1 + num2);
    }
}
