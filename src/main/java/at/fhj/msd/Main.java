package at.fhj.msd;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(3.0, 2.5));
        System.out.println(calculator.minus(1200, 56));
        System.out.println(calculator.divide(15,5));
        System.out.println(calculator.multiply(5.5, 23.4));
    }
}
