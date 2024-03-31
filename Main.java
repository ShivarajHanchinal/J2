public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calculate square root
        double num1 = 16.0; // Example number
        double squareRoot = calculator.squareRoot(num1);
        System.out.println("Square root of " + num1 + " is: " + squareRoot);

        // Calculate cube root
        double num2 = 27.0; // Example number
        double cubeRoot = calculator.cubeRoot(num2);
        System.out.println("Cube root of " + num2 + " is: " + cubeRoot);
    }
}