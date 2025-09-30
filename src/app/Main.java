package app;

public class Main {

    private static final double CONV_FAHRENHEIT_TO_CELSIUS = 5.0 / 9.0;
    private static final double CONV_CELSIUS_TO_FAHRENHEIT = 9.0 / 5.0;
    private static final double FAHRENHEIT_SHIFT = 32.0;

    public static void main(String[] args) {
        System.out.println("Temperature Converter App.");

        double fTemp = 10.0;
        double cTemp = 12.0;
        double celsius = convFToC(fTemp);
        double fahrenheit = convCToF(cTemp);

        System.out.printf(" %.2f Fahrenheit is: %.2f Celsius.%n", fTemp, celsius );
        System.out.printf(" %.2f Celsius is: %.2f Fahrenheit.%n", cTemp, fahrenheit );
    }

    private static double convFToC(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_SHIFT) * CONV_FAHRENHEIT_TO_CELSIUS;
    }

    private static double convCToF(double celsium) {
        return  (celsium * CONV_CELSIUS_TO_FAHRENHEIT) + FAHRENHEIT_SHIFT;
    }
}
