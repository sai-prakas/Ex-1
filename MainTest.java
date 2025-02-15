import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(20, Main.multiply(5, 4));
        assertEquals(0, Main.multiply(5, 0));
        assertEquals(-15, Main.multiply(-3, 5));
    }
}