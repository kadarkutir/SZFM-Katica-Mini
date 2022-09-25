import model.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    private void setUp() { calc = new Calculator(); }

    @Test
    void setResultEqualTest(){
        calc.setResultFive();
        calc.setResultAdd();
        calc.setResultNine();
        calc.setResultEqual();
        assertEquals("14.0",calc.getResult());
    }

    @Test
    void clearTest(){
        calc.setResultFive();
        calc.setResultAdd();
        calc.setResultNine();
        calc.clear();
        assertEquals(" ",calc.getResult());
    }
    @Test
    void deleteCharTest(){
        calc.setResultFive();
        calc.setResultAdd();
        calc.setResultNine();
        calc.deleteChar();
        assertEquals(" 5+",calc.getResult());
    }
}
