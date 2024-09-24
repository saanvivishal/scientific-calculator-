import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setUp() {
        calculator = new Main();
    }

    @Test
    public void testAddition() {
        double result = calculator.performOperation(1, 5, 3); // 1 represents addition
        Assert.assertEquals(8.0, result, 0.001); // 0.001 is the delta for double comparison
    }

    @Test
    public void testSubtraction() {
        double result = calculator.performOperation(2, 8, 3); // 2 represents subtraction
        Assert.assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        double result = calculator.performOperation(3, 4, 3); // 3 represents multiplication
        Assert.assertEquals(12.0, result, 0.001);
    }

    @Test
    public void testDivision() {
        double result = calculator.performOperation(4, 10, 2); // 4 represents division
        Assert.assertEquals(5.0, result, 0.001);
    }
}
