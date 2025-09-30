package app;

public class Main {

    private static final double CONV_FAHRENHEIT_TO_CELSIUS = 5.0 / 9.0;
    private static final double FAHRENHEIT_SHIFT = 32.0;

    public static void main(String[] args) {
        System.out.println("Temperature Converter App.");

        double fTemp = 10.0;
        double celsius = convFToC(fTemp);

        System.out.println(fTemp + " Fahrenheit is: " +   celsius + " Celsius.");
    }

    private static double convFToC(double fahrenheit) {
        return  Math.round(((fahrenheit - FAHRENHEIT_SHIFT) * CONV_FAHRENHEIT_TO_CELSIUS) * 100.0) / 100.0;
    }
}
