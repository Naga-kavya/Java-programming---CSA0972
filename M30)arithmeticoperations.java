public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int addition = a + b;
        System.out.println("Addition: " + addition);

        int subtraction = a - b;
        System.out.println("Subtraction: " + subtraction);

        int multiplication = a * b;
        System.out.println("Multiplication: " + multiplication);

        try {
            int division = a / b;
            System.out.println("Division: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible.");
        }
    }
}
