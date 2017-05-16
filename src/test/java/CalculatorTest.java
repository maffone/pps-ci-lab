import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gab on 16/05/17.
 */
public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void addTest() throws Exception {
        assertEquals(calc.add(2, 2), 4);
    }

    @Test
    public void subTest() throws Exception {
        assertEquals(calc.sub(2, 2), 0);
    }

}