package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    //creates a logger
    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2) {
        logger.debug("method add has been called with the following parameters: " + number1 + " ," + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug("method minus has been called with the following parameters: " + number1 + " ," + number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        logger.debug("method divide has been called with the following parameters: " + number1 + " ," + number2);
        if (number2 == 0) {
            logger.error("Division by 0 is not allowed.");
            throw new ArithmeticException("Exception: Division by 0");
        }

        return number1 / number2;

    }

    public double multiply(double number1, double number2) {
        logger.debug("method multiply has been called with the following parameters: " + number1 + " ," + number2);
        return number1 * number2;
    }

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
