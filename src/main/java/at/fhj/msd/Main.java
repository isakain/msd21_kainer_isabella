package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    //creates a logger
    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(3.0, 2.5));
        logger.info("This is just an info: Addition has been executed.");
        System.out.println(calculator.minus(1200, 56));
        logger.error("An error has occured after calling the minus-method.");
        System.out.println(calculator.divide(15,5));
        System.out.println(calculator.multiply(5.5, 23.4));
    }
}
