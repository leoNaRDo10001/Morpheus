
public class HelloWorld {

	public static void main(String[] args) {
		
		int number1 = 9;
		int number2 = 1;
		int sum = number1 + number2;
		System.out.println(sum*sum);
		
		char letter = 'R';
		String lettero = "letter";
		
		String newLine = System.getProperty("line.separator");//This will retrieve line separator dependent on OS.

		
		System.out.println(letter + newLine + lettero);

	}

}
