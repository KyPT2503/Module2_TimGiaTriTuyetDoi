import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute0() {
        int number=0;
        int expected=0;
        assertEquals(AbsoluteNumberCalculator.findAbsolute((number)),expected);
    }

    @Test
    void testFindAbsoluteNegativeNumber(){
        int number=-1;
        int expected=1;
        assertEquals(AbsoluteNumberCalculator.findAbsolute(-1),expected);
    }
    @Test
    void testFindAbsolutePositiveNumber(){
        int number=11;
        int expected=11;
        assertEquals(AbsoluteNumberCalculator.findAbsolute(number),expected);
    }
}