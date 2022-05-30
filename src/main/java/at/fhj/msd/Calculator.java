package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Represents a calculator that has the ability to perform basic calculations with two input values.
 *
 * @author Isabella Kainer
 */
public class Calculator {

    //creates a logger
    private static Logger logger = LogManager.getLogger();


    /**
     * Performs an addition of two given doubles.
     * @param number1 first operand of the addition
     * @param number2 second operand of the addition
     * @return double
     */
    public double add(double number1, double number2) {
        logger.debug("method add has been called with the following parameters: " + number1 + " ," + number2);
        return number1 + number2;
    }

    /**
     * Performs a subtraction of two given doubles.
     * @param number1 first operand of the subtraction
     * @param number2 second operand of the subtraction
     * @return double
     */
    public double minus(double number1, double number2) {
        logger.debug("method minus has been called with the following parameters: " + number1 + " ," + number2);
        return number1 - number2;
    }

    /**
     * Performs a division of two given doubles.
     * @param number1 first operand of the division
     * @param number2 second operand of the division
     * @return double
     * @throws ArithmeticException if the second operand number2 is 0
     */
    public double divide(double number1, double number2) {
        logger.debug("method divide has been called with the following parameters: " + number1 + " ," + number2);
        if (number2 == 0) {
            logger.error("Division by 0 is not allowed.");
            throw new ArithmeticException("Exception: Division by 0");
        }

        return number1 / number2;

    }

    /**
     * Performs a multiplication of two given doubles.
     * @param number1 first operand of the multiplication
     * @param number2 second operand of the multiplication
     * @return double
     */
    public double multiply(double number1, double number2) {
        logger.debug("method multiply has been called with the following parameters: " + number1 + " ," + number2);
        return number1 * number2;
    }

    /**
     * Calculates the factorial of a number recursively.
     * @param number the number for which the factorial is calculated
     * @return int
     */
    public int factorial(int number) {
        logger.debug("method factorial has been called with the following parameter: " + number);
        if (number == 1 || number == 0) {
            return 1;
        } else if (number < 0) {
            return 0;
        } else {
            return number * factorial(--number);
        }
    }
}
