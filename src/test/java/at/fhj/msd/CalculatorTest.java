package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }

    @Test
    public void addPositives() {
        double result = 12.1 + 50.2;
        Assertions.assertEquals(result, calc.add(12.1, 50.2));
    }

    @Test
    public void addPositiveAndNegative() {
        Assertions.assertEquals(2, calc.add(12, -10));
    }

    @Test
    public void minusPositives() {
        double result = 250.75 - 300.5;
        Assertions.assertEquals(result, calc.minus(250.75, 300.5));
    }

    @Test
    public void minusPositiveAndNegative() {
        Assertions.assertEquals(40, calc.minus(30, -10));
    }

    @Test
    public void multiplyPositives() {
        double result = 2.5 * 40;
        Assertions.assertEquals(result, calc.multiply(2.5, 40));
    }

    @Test
    public void multiplyPositiveAndNegative() {
        Assertions.assertEquals(-150, calc.multiply(50, -3));
    }

    @Test
    public void dividePositives() {
        Assertions.assertEquals(0.67, calc.divide(2, 3), 0.05);
    }

    @Test
    public void dividePositiveAndNegative() {
        double result = (double) -55 / 2;
        Assertions.assertEquals(result, calc.divide(-55, 2));
    }
}
