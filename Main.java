import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		new Calculator().main();
	}
	
	public void main() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Geben Sie eine Zahl ein: ");
		
		double number1 = scanner.nextDouble();
		
		System.out.print("Geben Sie eine weitere Zahl ein: ");
		
		double number2 = scanner.nextDouble();
		
		System.out.println("Wählen Sie die Grundrechenart aus:\n\n"
				+ "1. Addition\n"
				+ "2. Subtraktion\n"
				+ "3. Multiplikation\n"
				+ "4. Division\n");
		
		int choose = scanner.nextInt();
		scanner.close();
		
		double answer;
		
		switch (choose) {
			case 1:
				answer = add(number1, number2);
				break;
			case 2:
				answer = sub(number1, number2);
				break;
			case 3:
				answer = mult(number1, number2);
				break;
			case 4:
				answer = div(number1, number2);
				break;
			default:
				System.out.println("Diese Rechenart ist nicht vorgeschlagen. Abgebrochen.");
				return;
		}
		
		System.out.println("Ergebnis: " + answer);
	}
	
	private double add(double number1, double number2) {
		return number1 + number2;
	}
	
	private double sub(double number1, double number2) {
		return number1 - number2;
	}
	
	private double mult(double number1, double number2) {
		return number1 * number2;
	}
	
	private double div(double number1, double number2) {
		return number1 / number2;
	}
	

}
