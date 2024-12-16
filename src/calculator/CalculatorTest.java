package calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println("Addition: " + calculator.add(5, 3));
		System.out.println("Subtraktion: " + calculator.subtract(5, 3));
		System.out.println("Multiplikation: " + calculator.multiply(5, 3));
		System.out.println("Division: " + calculator.divide(10, 2));
	}
}
